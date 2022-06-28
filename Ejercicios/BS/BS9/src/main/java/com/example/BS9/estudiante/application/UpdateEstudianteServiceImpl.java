package com.example.BS9.estudiante.application;

import com.example.BS9.asignatura.application.port.FindAsignaturaService;
import com.example.BS9.asignatura.domain.EstudianteAsignatura;
import com.example.BS9.estudiante.application.port.UpdateEstudianteService;
import com.example.BS9.estudiante.domain.Estudiante;
import com.example.BS9.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.BS9.estudiante.infraestructure.repository.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UpdateEstudianteServiceImpl implements UpdateEstudianteService {
    @Autowired
    EstudianteRepositorio estudianteRepositorio;
    @Autowired
    FindAsignaturaService findAsignaturaService;

    @Override
    public Estudiante asignarAsignatura(EstudianteInputDTO estudianteInputDTO) throws Exception {
        Estudiante student = estudianteRepositorio.findById(estudianteInputDTO.getIdStudent()).orElseThrow(() -> new Exception("No se h encontrado el estudiante"));
        List<EstudianteAsignatura> listaOriginal = student.getEstudios().stream().toList();
        List<EstudianteAsignatura> listaNueva = new ArrayList<>();
        for (int i = 0;i < estudianteInputDTO.getEstudios().size();i++){
            EstudianteAsignatura asignatura = findAsignaturaService.findAsignaturaById(estudianteInputDTO.getEstudios().get(i));
            if (!listaOriginal.contains((asignatura)))
                listaNueva.add(asignatura);
        }
        student.getEstudios().addAll(listaNueva);
        return estudianteRepositorio.save(student);
    }

    @Override
    public Estudiante desasignarAsignatura(EstudianteInputDTO estudianteInputDTO) throws Exception {
        Estudiante student = estudianteRepositorio.findById(estudianteInputDTO.getIdStudent()).orElseThrow(() -> new Exception("No se h encontrado el estudiante"));
        List<EstudianteAsignatura> listaOriginal = student.getEstudios().stream().toList();
        List<EstudianteAsignatura> listaNueva = new ArrayList<>();
        for (int i = 0;i < estudianteInputDTO.getEstudios().size();i++){
            EstudianteAsignatura asignatura = findAsignaturaService.findAsignaturaById(estudianteInputDTO.getEstudios().get(i));
            if (listaOriginal.contains((asignatura)))
                listaNueva.add(asignatura);
        }
        student.getEstudios().removeAll(listaOriginal);
        student.getEstudios().addAll(listaNueva);
        return estudianteRepositorio.save(student);
    }
}

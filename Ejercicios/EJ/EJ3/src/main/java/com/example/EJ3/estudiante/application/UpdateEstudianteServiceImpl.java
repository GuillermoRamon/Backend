package com.example.EJ3.estudiante.application;

import com.example.EJ3.asignatura.application.port.FindAsignaturaService;
import com.example.EJ3.asignatura.domain.EstudianteAsignatura;
import com.example.EJ3.asignatura.infraestructure.repository.AsignaturaRepositorio;
import com.example.EJ3.estudiante.application.port.UpdateEstudianteService;
import com.example.EJ3.estudiante.domain.Estudiante;
import com.example.EJ3.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.EJ3.estudiante.infraestructure.repository.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

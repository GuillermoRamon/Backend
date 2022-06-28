package com.example.BS9.estudiante.application;

import com.example.BS9.asignatura.application.port.FindAsignaturaService;
import com.example.BS9.asignatura.domain.EstudianteAsignatura;
import com.example.BS9.estudiante.application.port.AddEstudianteService;
import com.example.BS9.estudiante.domain.Estudiante;
import com.example.BS9.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.BS9.estudiante.infraestructure.repository.EstudianteRepositorio;
import com.example.BS9.person.application.port.FindPersonaService;
import com.example.BS9.person.domain.Persona;
import com.example.BS9.profesor.application.port.FindProfesorService;
import com.example.BS9.profesor.domain.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddEstudianteServiceImpl implements AddEstudianteService {
    @Autowired
    EstudianteRepositorio estudianteRepositorio;
    @Autowired
    FindProfesorService findProfesorService;
    @Autowired
    FindPersonaService findPersonaService;
    @Autowired
    FindAsignaturaService findAsignaturaService;
    @Override
    public Estudiante saveEstudiante(EstudianteInputDTO estudianteInputDTO) throws Exception {
        Persona persona = findPersonaService.findPerson(estudianteInputDTO.getPersona());
        Profesor profesor = findProfesorService.findProfesorById(estudianteInputDTO.getProfesor());

        if(profesor.getPersona().getIdPersona().equals(persona.getIdPersona()))
            throw new RuntimeException("El estudiante que se quiere insertar es profesor");

        List<EstudianteAsignatura> lista = new ArrayList<>();
        for (int i = 0; i < estudianteInputDTO.getEstudios().size();i++){
            int x = estudianteInputDTO.getEstudios().get(i);
            EstudianteAsignatura asig = findAsignaturaService.findAsignaturaById(x);
            lista.add(asig);
        }
        return estudianteRepositorio.save(new Estudiante(estudianteInputDTO, persona, profesor, lista));
    }


}

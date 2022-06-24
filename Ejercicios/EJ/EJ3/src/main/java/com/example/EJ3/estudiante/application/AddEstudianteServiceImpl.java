package com.example.EJ3.estudiante.application;

import com.example.EJ3.asignatura.application.port.FindAsignaturaService;
import com.example.EJ3.asignatura.domain.EstudianteAsignatura;
import com.example.EJ3.estudiante.application.port.AddEstudianteService;
import com.example.EJ3.estudiante.domain.Estudiante;
import com.example.EJ3.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.EJ3.estudiante.infraestructure.repository.EstudianteRepositorio;
import com.example.EJ3.person.application.port.FindPersonaService;
import com.example.EJ3.person.domain.Persona;
import com.example.EJ3.profesor.application.port.FindProfesorService;
import com.example.EJ3.profesor.domain.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
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

package com.example.EJ3.profesor.application;

import com.example.EJ3.estudiante.application.port.FindEstudianteService;
import com.example.EJ3.estudiante.domain.Estudiante;
import com.example.EJ3.person.application.port.FindPersonaService;
import com.example.EJ3.person.domain.Persona;
import com.example.EJ3.profesor.application.port.AddProfesorService;
import com.example.EJ3.profesor.domain.Profesor;
import com.example.EJ3.profesor.infraestructure.controller.dto.input.ProfesorInputDTO;
import com.example.EJ3.profesor.infraestructure.repository.ProfesorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddProfesorServiceImpl implements AddProfesorService {

    @Autowired
    ProfesorRepositorio profesorRepositorio;
    @Autowired
    FindEstudianteService findEstudianteService;
    @Autowired
    FindPersonaService findPersonaService;
    @Override
    public Profesor saveProfesor(ProfesorInputDTO profesorInputDTO) throws Exception {
        Persona persona = findPersonaService.findPerson(profesorInputDTO.getPersona());

        List<Estudiante> lista = findEstudianteService.findEstudiantes();
        for (Estudiante e:lista) {
            if (e.getPersona().getIdPersona().equals(persona.getIdPersona()))
                throw new RuntimeException("El profesor que se intenta insertar ya es un estudiante");
        }

        return profesorRepositorio.save(new Profesor(profesorInputDTO, persona));
    }
}


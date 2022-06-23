package com.example.EJ3.profesor.application;

import com.example.EJ3.person.application.port.FindPersonaService;
import com.example.EJ3.person.domain.Persona;
import com.example.EJ3.profesor.application.port.AddProfesorService;
import com.example.EJ3.profesor.domain.Profesor;
import com.example.EJ3.profesor.infraestructure.controller.dto.input.ProfesorInputDTO;
import com.example.EJ3.profesor.infraestructure.repository.ProfesorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddProfesorServiceImpl implements AddProfesorService {

    @Autowired
    ProfesorRepositorio profesorRepositorio;

    @Autowired
    FindPersonaService findPersonaService;
    @Override
    public Profesor saveProfesor(ProfesorInputDTO profesorInputDTO) {
        Persona persona = findPersonaService.findPerson(profesorInputDTO.getPersona());
        return profesorRepositorio.save(new Profesor(profesorInputDTO, persona));
    }
}

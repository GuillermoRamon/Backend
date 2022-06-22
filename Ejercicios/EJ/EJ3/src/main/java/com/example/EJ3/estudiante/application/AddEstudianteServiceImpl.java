package com.example.EJ3.estudiante.application;

import com.example.EJ3.estudiante.application.port.AddEstudianteService;
import com.example.EJ3.estudiante.domain.Estudiante;
import com.example.EJ3.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.EJ3.estudiante.infraestructure.repository.EstudianteRepositorio;
import com.example.EJ3.person.application.port.FindPersonaService;
import com.example.EJ3.person.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class AddEstudianteServiceImpl implements AddEstudianteService {
    @Autowired
    EstudianteRepositorio estudianteRepositorio;

    @Autowired
    FindPersonaService findPersonaService;
    @Override
    public Estudiante saveEstudiante(EstudianteInputDTO estudianteInputDTO) {
        Persona persona = findPersonaService.findPerson(estudianteInputDTO.getPersona());
        return estudianteRepositorio.save(new Estudiante(estudianteInputDTO, persona));
    }
}

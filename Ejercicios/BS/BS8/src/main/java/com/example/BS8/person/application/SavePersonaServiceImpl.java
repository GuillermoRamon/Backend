package com.example.BS8.person.application;


import com.example.BS8.person.application.port.SavePersonaService;
import com.example.BS8.person.domain.Persona;
import com.example.BS8.person.infraestructure.repository.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class SavePersonaServiceImpl implements SavePersonaService {
    @Autowired
    PersonaRepositorio personaRepositorio;
    @Override
    public Persona addPerson(@Valid Persona persona) throws Exception {
        return personaRepositorio.save(persona);
    }
}

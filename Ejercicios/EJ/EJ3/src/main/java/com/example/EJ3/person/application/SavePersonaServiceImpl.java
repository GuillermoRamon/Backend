package com.example.EJ3.person.application;


import com.example.EJ3.person.application.port.SavePersonaService;
import com.example.EJ3.person.domain.Persona;
import com.example.EJ3.person.exception.UnprocesableException422;
import com.example.EJ3.person.infraestructure.repository.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class SavePersonaServiceImpl implements SavePersonaService {
    @Autowired
    PersonaRepositorio personaRepositorio;
    @Override
    public Persona addPerson(@Valid Persona persona) throws UnprocesableException422 {
        try{
           return personaRepositorio.save(persona);
        }catch (Exception e){
            throw new UnprocesableException422("no cumple con los requisitos establecidos");
        }

    }
}

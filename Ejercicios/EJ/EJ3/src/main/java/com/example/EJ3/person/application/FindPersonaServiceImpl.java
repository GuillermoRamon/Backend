package com.example.EJ3.person.application;


import com.example.EJ3.person.application.port.FindPersonaService;
import com.example.EJ3.person.domain.Persona;
import com.example.EJ3.person.exception.NotFoundException404;
import com.example.EJ3.person.infraestructure.repository.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindPersonaServiceImpl implements FindPersonaService {

    @Autowired
    PersonaRepositorio personaRepositorio;

    @Override
    public Persona findPerson(int id) throws NotFoundException404{
        return personaRepositorio.findById(id).orElseThrow(() -> new NotFoundException404("Persona no encontrada"));
    }

    @Override
    public List<Persona> findPersonsByUsuario(String usuario) {
        return personaRepositorio.findByUsuario(usuario);
    }

    @Override
    public List<Persona> findAllPersons() {
        return personaRepositorio.findAll();
    }
}

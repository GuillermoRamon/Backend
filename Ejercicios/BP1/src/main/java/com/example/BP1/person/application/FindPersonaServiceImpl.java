package com.example.BP1.person.application;


import com.example.BP1.person.application.port.FindPersonaService;
import com.example.BP1.person.domain.Persona;
import com.example.BP1.person.infraestructure.repository.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindPersonaServiceImpl implements FindPersonaService {

    @Autowired
    PersonaRepositorio personaRepositorio;

    @Override
    public Persona findPerson(int id) throws Exception{
        return personaRepositorio.findById(id).orElseThrow(() -> new Exception("Persona no encontrada"));
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

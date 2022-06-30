package com.example.JVA2.application;


import com.example.JVA2.application.port.PersonaService;
import com.example.JVA2.domain.Persona;
import com.example.JVA2.infraestructure.repository.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    PersonaRepositorio personaRepositorio;

    @Override
    public Persona addPerson(Persona persona) throws Exception {
        if (null == persona && null == persona.getUsuario() && null == persona.getPassword()
                && null == persona.getName() && null == persona.getCompanyEmail() && null == persona.getPersonalEmail()
                && null == persona.getCity() && null == persona.getCreateDate()) {throw new Exception("Persona no puede ser nulo"); }
        if (persona.getUsuario().length() > 10 && persona.getUsuario().length() < 6) { throw new Exception("Longitud de usuario no puede ser superior a 10 caracteres " +
                "e inderior a 6 caracteres");}
        return personaRepositorio.save(persona);

    }

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

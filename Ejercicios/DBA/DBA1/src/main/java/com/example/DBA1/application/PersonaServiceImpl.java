package com.example.DBA1.application;


import com.example.DBA1.application.port.PersonaService;
import com.example.DBA1.domain.Persona;
import com.example.DBA1.infraestructure.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    @Override
    public Persona addPerson(Persona persona) throws Exception {
        if (null == persona && null == persona.getUsuario() && null == persona.getPassword()
                && null == persona.getName() && null == persona.getCompanyEmail() && null == persona.getPersonalEmail()
                && null == persona.getCity() && null == persona.getCreateDate()) {throw new Exception("Persona no puede ser nulo"); }
        if (persona.getUsuario().length() > 10 && persona.getUsuario().length() < 6) { throw new Exception("Longitud de usuario no puede ser superior a 10 caracteres " +
                "e inderior a 6 caracteres");}
        return personaRepository.save(persona);

    }

    @Override
    public Persona findPerson(int id) throws Exception{
        return personaRepository.findById(id).orElseThrow(() -> new Exception("Persona no encontrada"));
    }

    @Override
    public List<Persona> findPersonsByUsuario(String usuario) {
        return personaRepository.findByUsuario(usuario);
    }

    @Override
    public List<Persona> findAllPersons() {
        return personaRepository.findAll();
    }
}

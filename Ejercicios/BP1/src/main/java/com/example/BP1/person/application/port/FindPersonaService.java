package com.example.BP1.person.application.port;

import com.example.BP1.person.domain.Persona;

import java.util.List;

public interface FindPersonaService {
    public Persona findPerson(int id) throws Exception;
    public List<Persona> findPersonsByUsuario(String usuario);
    public List<Persona> findAllPersons();
}

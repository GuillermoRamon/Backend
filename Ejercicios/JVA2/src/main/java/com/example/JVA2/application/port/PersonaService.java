package com.example.JVA2.application.port;

import com.example.JVA2.domain.Persona;

import java.util.List;

public interface PersonaService {
    public Persona addPerson(Persona persona) throws Exception;
    public Persona findPerson(int id) throws Exception;
    public List<Persona> findPersonsByUsuario(String usuario);
    public List<Persona> findAllPersons();
}

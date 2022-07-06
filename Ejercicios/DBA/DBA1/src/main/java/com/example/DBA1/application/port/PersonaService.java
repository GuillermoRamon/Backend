package com.example.DBA1.application.port;

import com.example.DBA1.domain.Persona;

import java.util.List;

public interface PersonaService {
    public Persona addPerson(Persona persona) throws Exception;
    public Persona findPerson(int id) throws Exception;
    public List<Persona> findPersonsByUsuario(String usuario);
    public List<Persona> findAllPersons();
}

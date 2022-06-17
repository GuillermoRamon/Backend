package com.example.BS8.person.application.port;


import com.example.BS8.person.domain.Persona;

public interface SavePersonaService {
    public Persona addPerson(Persona persona) throws Exception;

}

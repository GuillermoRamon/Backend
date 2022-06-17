package com.example.BP1.person.application.port;

import com.example.BP1.person.domain.Persona;

public interface SavePersonaService {
    public Persona addPerson(Persona persona) throws Exception;

}

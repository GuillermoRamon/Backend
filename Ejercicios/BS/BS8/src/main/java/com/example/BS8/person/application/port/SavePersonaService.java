package com.example.BS8.person.application.port;


import com.example.BS8.person.domain.Persona;
import com.example.BS8.person.exception.UnprocesableException422;

public interface SavePersonaService {
    public Persona addPerson(Persona persona) throws UnprocesableException422;

}

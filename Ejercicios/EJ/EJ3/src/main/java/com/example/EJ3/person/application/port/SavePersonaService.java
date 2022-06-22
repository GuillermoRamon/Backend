package com.example.EJ3.person.application.port;


import com.example.EJ3.person.domain.Persona;
import com.example.EJ3.person.exception.UnprocesableException422;

public interface SavePersonaService {
    public Persona addPerson(Persona persona) throws UnprocesableException422;

}

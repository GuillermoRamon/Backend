package com.example.BS12.person.application.port;


import com.example.BS12.person.domain.Persona;
import com.example.BS12.person.exception.UnprocesableException422;

public interface SavePersonaService {
    public Persona addPerson(Persona persona) throws UnprocesableException422;

}

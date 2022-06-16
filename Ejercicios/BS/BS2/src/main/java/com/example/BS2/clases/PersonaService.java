package com.example.BS2.clases;

import org.springframework.stereotype.Service;

@Service
public interface PersonaService {
    void setPersona(Persona persona);
    Persona getPersona();
}

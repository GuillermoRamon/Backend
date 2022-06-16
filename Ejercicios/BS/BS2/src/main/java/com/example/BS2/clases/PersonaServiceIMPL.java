package com.example.BS2.clases;

import org.springframework.stereotype.Service;

@Service
public class PersonaServiceIMPL implements PersonaService {
    Persona persona = new Persona();

    @Override
    public void setPersona(Persona p) {
        persona.setNombre(p.getNombre());
        persona.setEdad(p.getEdad());
        persona.setPoblacion(p.getPoblacion());
    }

    @Override
    public Persona getPersona() {
        return persona;
    }
}

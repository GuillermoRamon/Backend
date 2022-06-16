package com.example.RS1.service;

import com.example.RS1.clase.Persona;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface PersonaService {
    void addPersona(Persona persona);
    ArrayList<Persona> listaPersonas();
    void modPersona(Persona persona);

    void deletePersona(int id);
    ArrayList<Persona> buscarPersonaNombre(String nombre);
    Persona buscarPersonaId(int id);
}

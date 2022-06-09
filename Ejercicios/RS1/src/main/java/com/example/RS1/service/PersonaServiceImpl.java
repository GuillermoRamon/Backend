package com.example.RS1.service;

import com.example.RS1.clase.Persona;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class PersonaServiceImpl implements PersonaService{

    ArrayList<Persona> p = new ArrayList<>();
    ArrayList<Persona> person = new ArrayList<>();


    @Override
    public void addPersona(Persona persona) {
        p.add(persona);
    }

    @Override
    public ArrayList<Persona> listaPersonas() {
        return p;
    }

    @Override
    public void modPersona(Persona persona) {
        for (Persona pe: p) {
            if (pe.getId() == persona.getId()){
                pe.setNombre(persona.getNombre());
                pe.setEdad(persona.getEdad());
                pe.setPoblacion(persona.getPoblacion());
            }
        }
    }

    @Override
    public void deletePersona(int id) {
        for (Persona pe:p) {
            if(id == pe.getId()){
                p.remove(pe);
                return;
            }
        }
    }

    @Override
    public ArrayList<Persona> buscarPersonaNombre(String nombre) {
        person.clear();
        for (Persona pe:p) {
            if(nombre.equals(pe.getNombre())){
                person.add(pe);
            }
        }
        return person;
    }

    @Override
    public Persona buscarPersonaId(int id) {
        for (Persona pe:p) {
            if(id == pe.getId()){
                return pe;
            }
        }
        return null;
    }

}

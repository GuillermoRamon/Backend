package com.example.EJ2.service;

import com.example.EJ2.clase.Persona;
import com.example.EJ2.dto.PersonaOutPutDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PersonaService {
    public Persona addPerson(Persona persona) throws Exception;
    public Persona findPerson(int id) throws Exception;
    public List<Persona> findPersonsByUsuario(String usuario);
    public List<Persona> findAllPersons();
}

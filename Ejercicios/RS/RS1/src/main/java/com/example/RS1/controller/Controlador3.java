package com.example.RS1.controller;

import com.example.RS1.clase.Persona;
import com.example.RS1.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("persona3")
public class Controlador3 {

    @Autowired
    PersonaService ps;

    @DeleteMapping("/{id}")
    public ArrayList<Persona> deletePerson(@PathVariable int id){
        ps.deletePersona(id);
        return ps.listaPersonas();
    }
}

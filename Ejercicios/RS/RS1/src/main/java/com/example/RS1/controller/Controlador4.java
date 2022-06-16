package com.example.RS1.controller;

import com.example.RS1.clase.Persona;
import com.example.RS1.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("persona4")
public class Controlador4 {

    @Autowired
    PersonaService ps;

    @GetMapping("/{id}")
    public Persona findPerson(@PathVariable int id){
        return ps.buscarPersonaId(id);
    }

    @GetMapping("/nombre/{nombre}")
    public ArrayList<Persona> findPerson2(@PathVariable String nombre){
        return ps.buscarPersonaNombre(nombre);
    }
}

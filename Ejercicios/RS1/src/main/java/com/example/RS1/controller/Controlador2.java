package com.example.RS1.controller;

import com.example.RS1.clase.Persona;
import com.example.RS1.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("persona2")
public class Controlador2 {

    @Autowired
    PersonaService ps;

    @PutMapping("/persona")
    public ArrayList<Persona> updatePerson(@RequestBody Persona p){
        ps.modPersona(p);
        return ps.listaPersonas();
    }
}

package com.example.RS1.controller;

import com.example.RS1.clase.Persona;
import com.example.RS1.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@RestController
@RequestMapping("persona1")
public class Controlador1 {

    @Autowired
    PersonaService ps;

    @PostMapping("/persona")
    public ArrayList<Persona> addPerson(@RequestBody Persona p){
        ps.addPersona(p);
        return ps.listaPersonas();
    }

}

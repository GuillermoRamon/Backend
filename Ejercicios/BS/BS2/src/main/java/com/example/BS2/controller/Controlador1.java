package com.example.BS2.controller;

import com.example.BS2.clases.Ciudad;
import com.example.BS2.clases.Persona;
import com.example.BS2.clases.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@RestController
public class Controlador1 {

    @Autowired
    PersonaService personaService;
    @Autowired
    ArrayList<Ciudad> lista;

    @Autowired
    @Qualifier("bean1")
    Persona p1;

    @Autowired
    @Qualifier("bean2")
    Persona p2;

    @Autowired
    @Qualifier("bean3")
    Persona p3;


    @PostMapping("/controlador1/addPersona")
    public Persona addPerson(@RequestHeader Map<String, String> key){
        personaService.setPersona(Persona.builder().nombre(key.get("nombre")).edad(Integer.parseInt(key.get("edad"))).poblacion(key.get("ciudad")).build());
        return personaService.getPersona();
    }

    @PostMapping("/controlador1/addCiudad")
    public Ciudad addCiudad(@RequestHeader Map<String, String> key){
        Ciudad c = Ciudad.builder().nombre(key.get("nombre")).num_hab(Integer.parseInt(key.get("cantidad"))).build();
        lista.add(c);
        return c;
    }

    @GetMapping("/controlador1/bean/")
    public Persona getBean(@RequestParam int num) {
        if (num == 1) {
            return p1;
        } else if (num == 2) {
            return p2;
        } else if (num == 3) {
            return p3;
        }
        return p1;
    }


}
package com.example.BS2.controller;

import com.example.BS2.clases.Ciudad;
import com.example.BS2.clases.Persona;
import com.example.BS2.clases.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controlador2 {

    @Autowired
    PersonaService personaService;
    @Autowired
    ArrayList<Ciudad> lista;



    @GetMapping("/controlador2/getPersona")
    public Persona getPerson(){
        int edad = personaService.getPersona().getEdad() * 2;
        personaService.getPersona().setEdad(edad);
        return personaService.getPersona();
    }

    @GetMapping("/controlador2/getCiudades")
    public ArrayList<Ciudad> ciudades(){
        return  lista;
    }


}

package com.example.BS0.controller;

import com.example.BS0.clase.Persona;
import org.springframework.web.bind.annotation.*;

@RestController()
public class Controlador1 {
    @GetMapping("/user")
    public String getHola(@RequestParam String nombre){
        return "Hola " + nombre;
    }

    @PostMapping("/useradd")
    public Persona useradd(@RequestBody Persona p){
        int edadSuma = p.getEdad() + 1;
        p.setEdad(edadSuma);
        return p;
    }

}

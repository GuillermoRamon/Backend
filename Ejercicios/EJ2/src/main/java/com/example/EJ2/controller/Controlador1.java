package com.example.EJ2.controller;

import com.example.EJ2.clase.Persona;
import com.example.EJ2.dto.PersonaInPutDto;
import com.example.EJ2.dto.PersonaOutPutDto;
import com.example.EJ2.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class Controlador1 {

    @Autowired
    PersonaService personaService;

    @PostMapping("/save")
    public ResponseEntity<PersonaOutPutDto> anadirPerson(@RequestBody PersonaInPutDto personaInPutDto) throws Exception {
        return new ResponseEntity<>(new PersonaOutPutDto(personaService.addPerson(new Persona(personaInPutDto))),HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<PersonaOutPutDto> findPersonId(@PathVariable int id) throws Exception{
        return new ResponseEntity<>(new PersonaOutPutDto(personaService.findPerson(id)), HttpStatus.ACCEPTED);
    }

    @GetMapping("/nombre/{usuario}")
    public ResponseEntity<List<PersonaOutPutDto>> findPersonsNombre(@PathVariable String usuario){
        return new ResponseEntity<>(personaService
                .findPersonsByUsuario(usuario)
                .stream()
                .map(persona -> new PersonaOutPutDto(persona))
                .toList(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<PersonaOutPutDto>> findallPerson(){
        return new ResponseEntity<>(personaService
                .findAllPersons()
                .stream()
                .map(persona -> new PersonaOutPutDto(persona))
                .toList(), HttpStatus.ACCEPTED);
    }
}

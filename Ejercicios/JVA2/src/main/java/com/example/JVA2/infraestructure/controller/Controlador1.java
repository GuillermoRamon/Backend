package com.example.JVA2.infraestructure.controller;

import com.example.JVA2.domain.Persona;
import com.example.JVA2.infraestructure.controller.dto.PersonaInputDTO;
import com.example.JVA2.infraestructure.controller.dto.PersonaOutputDTO;
import com.example.JVA2.application.port.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class Controlador1 {

    @Autowired
    PersonaService personaService;

    @PostMapping("/save")
    public ResponseEntity<PersonaOutputDTO> anadirPerson(@RequestBody PersonaInputDTO personaInPutDto) throws Exception {
        return new ResponseEntity<>(new PersonaOutputDTO(personaService.addPerson(new Persona(personaInPutDto))),HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<PersonaOutputDTO> findPersonId(@PathVariable int id) throws Exception{
        return new ResponseEntity<>(new PersonaOutputDTO(personaService.findPerson(id)), HttpStatus.ACCEPTED);
    }

    @GetMapping("/nombre/{usuario}")
    public ResponseEntity<List<PersonaOutputDTO>> findPersonsNombre(@PathVariable String usuario){
        return new ResponseEntity<>(personaService
                .findPersonsByUsuario(usuario)
                .stream()
                .map(persona -> new PersonaOutputDTO(persona))
                .toList(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<PersonaOutputDTO>> findallPerson(){
        return new ResponseEntity<>(personaService
                .findAllPersons()
                .stream()
                .map(persona -> new PersonaOutputDTO(persona))
                .toList(), HttpStatus.ACCEPTED);
    }
}

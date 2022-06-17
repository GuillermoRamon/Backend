package com.example.BP1.person.infraestructure.controller;

import com.example.BP1.person.infraestructure.controller.dto.output.PersonaOutputDTO;
import com.example.BP1.person.application.port.FindPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class FindPersonController {

    @Autowired
    FindPersonaService findPersonaService;

    @GetMapping("/{id}")
    public ResponseEntity<PersonaOutputDTO> findPersonId(@PathVariable int id) throws Exception{
        return new ResponseEntity<>(new PersonaOutputDTO(findPersonaService.findPerson(id)), HttpStatus.ACCEPTED);
    }

    @GetMapping("/nombre/{usuario}")
    public ResponseEntity<List<PersonaOutputDTO>> findPersonsNombre(@PathVariable String usuario){
        return new ResponseEntity<>(findPersonaService
                .findPersonsByUsuario(usuario)
                .stream()
                .map(persona -> new PersonaOutputDTO(persona))
                .toList(), HttpStatus.ACCEPTED);
    }

    @GetMapping
    public ResponseEntity<List<PersonaOutputDTO>> findallPerson(){
        return new ResponseEntity<>(findPersonaService
                .findAllPersons()
                .stream()
                .map(persona -> new PersonaOutputDTO(persona))
                .toList(), HttpStatus.ACCEPTED);
    }
}

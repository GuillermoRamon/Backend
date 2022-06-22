package com.example.EJ3.person.infraestructure.controller;

import com.example.EJ3.person.application.port.SavePersonaService;
import com.example.EJ3.person.domain.Persona;
import com.example.EJ3.person.exception.UnprocesableException422;
import com.example.EJ3.person.infraestructure.controller.dto.input.PersonaInputDTO;
import com.example.EJ3.person.infraestructure.controller.dto.output.PersonaOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class AddPersonController {
    @Autowired
    SavePersonaService savePersonaService;

    @PostMapping
    public ResponseEntity<PersonaOutputDTO> anadirPerson(@RequestBody PersonaInputDTO personaInPutDto) throws UnprocesableException422 {
        return new ResponseEntity<>(new PersonaOutputDTO(savePersonaService.addPerson(new Persona(personaInPutDto))), HttpStatus.OK);
    }
}
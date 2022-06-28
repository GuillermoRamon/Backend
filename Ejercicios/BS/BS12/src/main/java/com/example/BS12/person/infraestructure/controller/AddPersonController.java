package com.example.BS12.person.infraestructure.controller;

import com.example.BS12.person.application.port.SavePersonaService;
import com.example.BS12.person.domain.Persona;
import com.example.BS12.person.exception.UnprocesableException422;
import com.example.BS12.person.infraestructure.controller.dto.input.PersonaInputDTO;
import com.example.BS12.person.infraestructure.controller.dto.output.PersonaOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/person")
@CrossOrigin(origins = "*")
public class AddPersonController {
    @Autowired
    SavePersonaService savePersonaService;

    @PostMapping("/addperson")
    public ResponseEntity<PersonaOutputDTO> anadirPerson(@RequestBody PersonaInputDTO personaInPutDto) throws UnprocesableException422 {
        return new ResponseEntity<>(new PersonaOutputDTO(savePersonaService.addPerson(new Persona(personaInPutDto))), HttpStatus.OK);
    }
}

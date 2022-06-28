package com.example.BS12.person.infraestructure.controller;

import com.example.BS12.person.application.port.FindPersonaService;
import com.example.BS12.person.exception.NotFoundException404;
import com.example.BS12.person.infraestructure.controller.dto.output.PersonaOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/person")
@CrossOrigin(origins = "*")
public class FindPersonController {

    @Autowired
    FindPersonaService findPersonaService;

    @GetMapping("/person/{id}")
    public ResponseEntity<PersonaOutputDTO> findPersonId(@PathVariable int id) throws NotFoundException404 {
        return new ResponseEntity<>(new PersonaOutputDTO(findPersonaService.findPerson(id)), HttpStatus.ACCEPTED);
    }

    @GetMapping("/person/nombre/{usuario}")
    public ResponseEntity<List<PersonaOutputDTO>> findPersonsNombre(@PathVariable String usuario){
        return new ResponseEntity<>(findPersonaService
                .findPersonsByUsuario(usuario)
                .stream()
                .map(persona -> new PersonaOutputDTO(persona))
                .toList(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/getall")
    public ResponseEntity<List<PersonaOutputDTO>> findallPerson(){
        return new ResponseEntity<>(findPersonaService
                .findAllPersons()
                .stream()
                .map(persona -> new PersonaOutputDTO(persona))
                .toList(), HttpStatus.ACCEPTED);
    }

}

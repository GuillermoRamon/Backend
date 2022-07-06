package com.example.DBA1.infraestructure.controller;

import com.example.DBA1.domain.Persona;
import com.example.DBA1.infraestructure.controller.dto.PersonaInputDTO;
import com.example.DBA1.infraestructure.controller.dto.PersonaOutputDTO;
import com.example.DBA1.application.port.PersonaService;
import com.example.DBA1.infraestructure.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonaService personaService;

    @Autowired
    PersonaRepository personaRepository;

    @PostMapping
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

    @GetMapping
    public ResponseEntity<List<PersonaOutputDTO>> findallPerson(){
        return new ResponseEntity<>(personaService
                .findAllPersons()
                .stream()
                .map(persona -> new PersonaOutputDTO(persona))
                .toList(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/query")
    public List<Persona> getData(@RequestParam(required = false) Integer idPersona, @RequestParam(required = false) String usuario,
                                 @RequestParam(required = false) String name, @RequestParam(required = false) String surname,
                                 @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date createDate,
                                 @RequestParam(required=false) String dateCondition, @RequestParam(required = false, defaultValue = "default") String order){
        HashMap<String,Object> hm= new HashMap<>();
        if(idPersona != null)
            hm.put("idPersona",idPersona);
        else if (usuario !=null)
            hm.put("usuario",usuario);
        else if (name !=null) {
            hm.put("name", name);
            hm.put("order", order);
        }
        else if (surname !=null) {
            hm.put("surname", surname);
            hm.put("order", order);
        }
        else if (createDate !=null){
            if(dateCondition.equals("GREATER_THAN"))
                search(hm, createDate, dateCondition, order);
            else if(dateCondition.equals("LESS_THAN"))
                search(hm, createDate, dateCondition, order);
            else if(dateCondition.equals("EQUAL"))
                search(hm, createDate, dateCondition, order);
        }
        return personaRepository.getData(hm);
    }

    private void search(HashMap<String, Object> hm, Date createDate, String dateCondition, String order) {
        hm.put("createDate", createDate);
        hm.put("dateCondition",dateCondition);
        hm.put("order",order);
    }
}

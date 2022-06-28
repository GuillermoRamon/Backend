package com.example.BS9.person.infraestructure.controller;

import com.example.BS9.person.application.port.FindPersonaService;
import com.example.BS9.person.application.port.IFeignServer;
import com.example.BS9.person.exception.NotFoundException404;
import com.example.BS9.person.infraestructure.controller.dto.output.PersonaOutputDTO;
import com.example.BS9.profesor.infraestructure.controller.dto.output.ProfesorOuputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/person")
public class FindPersonController {

    @Autowired
    FindPersonaService findPersonaService;
    @Autowired
    IFeignServer iFeignServer;

    @GetMapping("/{id}")
    public ResponseEntity<PersonaOutputDTO> findPersonId(@PathVariable int id) throws NotFoundException404 {
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

    /*@GetMapping("/profesor/{id}")
    ResponseEntity<ProfesorOuputDTO> getProfesor(@PathVariable int id) throws Exception{
        try {
            ResponseEntity<ProfesorOuputDTO> professorOutputDTO = new RestTemplate().getForEntity("localhost:8081/profesor/" + id, ProfesorOuputDTO.class);
            return ResponseEntity.ok(professorOutputDTO.getBody());
        }
        catch(HttpClientErrorException k1) {
            throw new Exception("Http code is not 2XX. The server responded: " + k1.getStatusCode() +
                    " Cause: "+ k1.getResponseBodyAsString());
        } catch (RestClientException k) {
            throw new Exception("The server didn't respond: " + k.getMessage());
        }
    }*/

    @GetMapping("/profesor/{id}")
    ResponseEntity<ProfesorOuputDTO> callProfesorByServer(@PathVariable int id) throws Exception{
        ResponseEntity<ProfesorOuputDTO> respuesta = iFeignServer.callProfesor(id);
        return respuesta;
    }

}

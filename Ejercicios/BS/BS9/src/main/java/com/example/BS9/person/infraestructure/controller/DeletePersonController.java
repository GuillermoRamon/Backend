package com.example.BS9.person.infraestructure.controller;

import com.example.BS9.person.application.port.DeletePersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class DeletePersonController {
    @Autowired
    DeletePersonaService deletePersonaService;
    @DeleteMapping("/{id}")
    public ResponseEntity borrarPersona(@PathVariable int id){
        deletePersonaService.borrarPersonaId(id);
        return ResponseEntity.status(HttpStatus.OK).body("Se ha eliminado la persona correctamente");
    }
}

package com.example.EJ3.profesor.infraestructure.controller;

import com.example.EJ3.profesor.application.port.AddProfesorService;
import com.example.EJ3.profesor.infraestructure.controller.dto.input.ProfesorInputDTO;
import com.example.EJ3.profesor.infraestructure.controller.dto.output.ProfesorOuputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profesor")
public class AddProfesorController {
    @Autowired
    AddProfesorService addProfesorService;

    @PostMapping
    public ResponseEntity<ProfesorOuputDTO> anadirProfesor(@RequestBody ProfesorInputDTO profesorInputDTO){
        return new ResponseEntity<>(new ProfesorOuputDTO(addProfesorService.saveProfesor(profesorInputDTO)), HttpStatus.ACCEPTED);
    }
}

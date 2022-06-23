package com.example.EJ3.asignatura.infraestructure.controller;

import com.example.EJ3.asignatura.application.port.AddAsignaturaService;
import com.example.EJ3.asignatura.infraestructure.controller.dto.input.AsignaturaInputDTO;
import com.example.EJ3.asignatura.infraestructure.controller.dto.output.AsignaturaOuputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subject")
public class AddAsignaturaController {
    @Autowired
    AddAsignaturaService addAsignaturaService;

    @PostMapping
    public ResponseEntity<AsignaturaOuputDTO> anadirAsignatura(@RequestBody AsignaturaInputDTO asignaturaInputDTO){
        return new ResponseEntity<>(new AsignaturaOuputDTO(addAsignaturaService.saveAsignatura(asignaturaInputDTO)), HttpStatus.ACCEPTED);
    }
}

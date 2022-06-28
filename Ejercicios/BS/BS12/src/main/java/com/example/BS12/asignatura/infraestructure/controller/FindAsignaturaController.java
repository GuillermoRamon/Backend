package com.example.BS12.asignatura.infraestructure.controller;

import com.example.BS12.asignatura.application.port.FindAsignaturaService;
import com.example.BS12.estudiante.infraestructure.controller.dto.output.EstudianteOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subject")
public class FindAsignaturaController {

    @Autowired
    FindAsignaturaService findAsignaturaService;

    @GetMapping("/{id}")
    public ResponseEntity findStudentId (@PathVariable int id) throws Exception {
        return new ResponseEntity<>(new EstudianteOutputDTO(findAsignaturaService.findEstudianteById(id)), HttpStatus.ACCEPTED);
    }
}

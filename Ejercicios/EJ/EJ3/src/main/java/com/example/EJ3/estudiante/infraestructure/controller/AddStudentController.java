package com.example.EJ3.estudiante.infraestructure.controller;

import com.example.EJ3.estudiante.application.port.AddEstudianteService;
import com.example.EJ3.estudiante.domain.Estudiante;
import com.example.EJ3.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.EJ3.estudiante.infraestructure.controller.dto.output.EstudianteOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class AddStudentController {
    @Autowired
    AddEstudianteService estudianteService;

    @PostMapping
    public ResponseEntity<EstudianteOutputDTO> anadirEstudiante(@RequestBody EstudianteInputDTO estudianteInputDTO){
        return new ResponseEntity<>(new EstudianteOutputDTO(estudianteService.saveEstudiante(estudianteInputDTO)), HttpStatus.ACCEPTED);
    }
}

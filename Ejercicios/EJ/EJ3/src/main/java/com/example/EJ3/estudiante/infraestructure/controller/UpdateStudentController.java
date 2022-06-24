package com.example.EJ3.estudiante.infraestructure.controller;

import com.example.EJ3.estudiante.application.port.UpdateEstudianteService;
import com.example.EJ3.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.EJ3.estudiante.infraestructure.controller.dto.output.EstudianteOutputDTO;
import com.example.EJ3.estudiante.infraestructure.controller.dto.output.EstudianteOutputFullDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class UpdateStudentController {
    @Autowired
    UpdateEstudianteService updateEstudianteService;

    @PutMapping
    public ResponseEntity<EstudianteOutputDTO> anadirAsignatura(@RequestBody EstudianteInputDTO estudianteInputDTO){
        return null;
    }
}

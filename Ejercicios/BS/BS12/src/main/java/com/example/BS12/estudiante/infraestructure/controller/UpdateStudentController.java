package com.example.BS12.estudiante.infraestructure.controller;

import com.example.BS12.estudiante.application.port.UpdateEstudianteService;
import com.example.BS12.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.BS12.estudiante.infraestructure.controller.dto.output.EstudianteOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @PutMapping("/add")
    public ResponseEntity<EstudianteOutputDTO> anadirAsignatura(@RequestBody EstudianteInputDTO estudianteInputDTO) throws Exception {
        return new ResponseEntity<>(new EstudianteOutputDTO(updateEstudianteService.asignarAsignatura(estudianteInputDTO)), HttpStatus.ACCEPTED);
    }

    @PutMapping("/delete")
    public ResponseEntity<EstudianteOutputDTO> quitarAsignatura(@RequestBody EstudianteInputDTO estudianteInputDTO) throws Exception {
        return new ResponseEntity<>(new EstudianteOutputDTO(updateEstudianteService.desasignarAsignatura(estudianteInputDTO)), HttpStatus.ACCEPTED);
    }
}

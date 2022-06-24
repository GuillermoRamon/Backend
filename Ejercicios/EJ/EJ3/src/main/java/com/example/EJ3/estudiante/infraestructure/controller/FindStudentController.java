package com.example.EJ3.estudiante.infraestructure.controller;


import com.example.EJ3.estudiante.application.port.FindEstudianteService;
import com.example.EJ3.estudiante.infraestructure.controller.dto.output.EstudianteOutputDTO;
import com.example.EJ3.estudiante.infraestructure.controller.dto.output.EstudianteOutputFullDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class FindStudentController {
    @Autowired
    FindEstudianteService estudianteService;

    @GetMapping("/{id}")
    public ResponseEntity findStudentId (@PathVariable int id, @RequestParam(defaultValue = "simple", name = "ouputType") String ouputType) throws Exception {
        switch (ouputType.toLowerCase()){
            case "simple":
                return new ResponseEntity<>(new EstudianteOutputDTO(estudianteService.findEstudianteById(id)), HttpStatus.ACCEPTED);
            case "full":
                return new ResponseEntity<>(new EstudianteOutputFullDTO(estudianteService.findEstudianteById(id)), HttpStatus.ACCEPTED);
            default:
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Elige entre full o simple");
        }
    }
}

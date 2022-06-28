package com.example.BS9.profesor.infraestructure.controller;

import com.example.BS9.profesor.application.port.FindProfesorService;
import com.example.BS9.profesor.infraestructure.controller.dto.output.ProfesorOuputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profesor")
public class FindTeacherController {
    @Autowired
    FindProfesorService findProfesorService;
    @GetMapping("/{id}")
    public ResponseEntity<ProfesorOuputDTO> findProfesorId(@PathVariable int id) throws Exception {
        return new ResponseEntity<>(new ProfesorOuputDTO(findProfesorService.findProfesorById(id)), HttpStatus.ACCEPTED);
    }
}

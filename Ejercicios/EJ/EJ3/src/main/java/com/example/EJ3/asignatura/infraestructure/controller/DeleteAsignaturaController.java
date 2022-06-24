package com.example.EJ3.asignatura.infraestructure.controller;

import com.example.EJ3.asignatura.application.port.DeleteAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subject")
public class DeleteAsignaturaController {
    @Autowired
    DeleteAsignaturaService deleteAsignaturaService;
    @DeleteMapping("/{id}")
    public ResponseEntity borrarPersona(@PathVariable int id){
        deleteAsignaturaService.BorrarAsignatura(id);
        return ResponseEntity.status(HttpStatus.OK).body("Se ha eliminado la asignatura correctamente");
    }
}

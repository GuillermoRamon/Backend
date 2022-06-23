package com.example.EJ3.profesor.application.port;

import com.example.EJ3.profesor.domain.Profesor;
import com.example.EJ3.profesor.infraestructure.controller.dto.input.ProfesorInputDTO;

public interface AddProfesorService {
    public Profesor saveProfesor(ProfesorInputDTO profesorInputDTO);
}

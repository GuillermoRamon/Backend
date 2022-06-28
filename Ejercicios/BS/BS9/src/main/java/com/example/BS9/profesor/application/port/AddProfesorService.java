package com.example.BS9.profesor.application.port;

import com.example.BS9.profesor.domain.Profesor;
import com.example.BS9.profesor.infraestructure.controller.dto.input.ProfesorInputDTO;

public interface AddProfesorService {
    public Profesor saveProfesor(ProfesorInputDTO profesorInputDTO) throws Exception;
}

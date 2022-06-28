package com.example.BS12.profesor.application.port;

import com.example.BS12.profesor.domain.Profesor;
import com.example.BS12.profesor.infraestructure.controller.dto.input.ProfesorInputDTO;

public interface AddProfesorService {
    public Profesor saveProfesor(ProfesorInputDTO profesorInputDTO) throws Exception;
}

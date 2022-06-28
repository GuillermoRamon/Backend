package com.example.BS9.estudiante.application.port;

import com.example.BS9.estudiante.domain.Estudiante;
import com.example.BS9.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;

public interface AddEstudianteService {
    public Estudiante saveEstudiante(EstudianteInputDTO estudianteInputDTO) throws Exception;
}

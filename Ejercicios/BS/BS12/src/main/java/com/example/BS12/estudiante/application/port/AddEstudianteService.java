package com.example.BS12.estudiante.application.port;

import com.example.BS12.estudiante.domain.Estudiante;
import com.example.BS12.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;

public interface AddEstudianteService {
    public Estudiante saveEstudiante(EstudianteInputDTO estudianteInputDTO) throws Exception;
}

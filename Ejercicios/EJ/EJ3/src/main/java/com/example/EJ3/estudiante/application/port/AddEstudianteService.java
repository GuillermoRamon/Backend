package com.example.EJ3.estudiante.application.port;

import com.example.EJ3.estudiante.domain.Estudiante;
import com.example.EJ3.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;

public interface AddEstudianteService {
    public Estudiante saveEstudiante(EstudianteInputDTO estudianteInputDTO) throws Exception;
}

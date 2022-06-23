package com.example.EJ3.asignatura.application.port;

import com.example.EJ3.asignatura.domain.EstudianteAsignatura;
import com.example.EJ3.asignatura.infraestructure.controller.dto.input.AsignaturaInputDTO;

public interface AddAsignaturaService {
    public EstudianteAsignatura saveAsignatura(AsignaturaInputDTO asignaturaInputDTO);
}

package com.example.BS9.asignatura.application.port;

import com.example.BS9.asignatura.domain.EstudianteAsignatura;
import com.example.BS9.asignatura.infraestructure.controller.dto.input.AsignaturaInputDTO;

public interface AddAsignaturaService {
    public EstudianteAsignatura saveAsignatura(AsignaturaInputDTO asignaturaInputDTO);
}

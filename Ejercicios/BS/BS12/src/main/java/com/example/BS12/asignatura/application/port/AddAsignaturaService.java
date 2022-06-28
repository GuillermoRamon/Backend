package com.example.BS12.asignatura.application.port;

import com.example.BS12.asignatura.domain.EstudianteAsignatura;
import com.example.BS12.asignatura.infraestructure.controller.dto.input.AsignaturaInputDTO;

public interface AddAsignaturaService {
    public EstudianteAsignatura saveAsignatura(AsignaturaInputDTO asignaturaInputDTO);
}

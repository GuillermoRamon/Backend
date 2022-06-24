package com.example.EJ3.estudiante.application.port;

import com.example.EJ3.estudiante.domain.Estudiante;
import com.example.EJ3.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;

public interface UpdateEstudianteService {
    public Estudiante asignarAsignatura(EstudianteInputDTO estudianteInputDTO);
    public Estudiante desasignarAsignatura(EstudianteInputDTO estudianteInputDTO);
}

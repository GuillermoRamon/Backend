package com.example.BS9.estudiante.application.port;

import com.example.BS9.estudiante.domain.Estudiante;
import com.example.BS9.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;

public interface UpdateEstudianteService {
    public Estudiante asignarAsignatura(EstudianteInputDTO estudianteInputDTO) throws Exception;
    public Estudiante desasignarAsignatura(EstudianteInputDTO estudianteInputDTO) throws Exception;
}

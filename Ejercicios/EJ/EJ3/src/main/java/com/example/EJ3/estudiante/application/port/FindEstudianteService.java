package com.example.EJ3.estudiante.application.port;

import com.example.EJ3.estudiante.domain.Estudiante;

public interface FindEstudianteService {
    public Estudiante findEstudianteSimple(int id) throws Exception;
}

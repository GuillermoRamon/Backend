package com.example.EJ3.asignatura.application.port;

import com.example.EJ3.asignatura.domain.EstudianteAsignatura;

public interface FindAsignaturaService {
    public EstudianteAsignatura findAsignaturaById(int id) throws Exception;
}

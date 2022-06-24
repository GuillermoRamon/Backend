package com.example.EJ3.asignatura.application.port;

import com.example.EJ3.asignatura.domain.EstudianteAsignatura;
import com.example.EJ3.estudiante.domain.Estudiante;

public interface FindAsignaturaService {
    public EstudianteAsignatura findAsignaturaById(int id) throws Exception;
    public Estudiante findEstudianteById(int id) throws Exception;

}

package com.example.BS9.asignatura.application.port;

import com.example.BS9.asignatura.domain.EstudianteAsignatura;
import com.example.BS9.estudiante.domain.Estudiante;

public interface FindAsignaturaService {
    public EstudianteAsignatura findAsignaturaById(int id) throws Exception;
    public Estudiante findEstudianteById(int id) throws Exception;

}

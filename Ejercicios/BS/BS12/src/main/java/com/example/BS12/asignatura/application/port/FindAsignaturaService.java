package com.example.BS12.asignatura.application.port;

import com.example.BS12.asignatura.domain.EstudianteAsignatura;
import com.example.BS12.estudiante.domain.Estudiante;

public interface FindAsignaturaService {
    public EstudianteAsignatura findAsignaturaById(int id) throws Exception;
    public Estudiante findEstudianteById(int id) throws Exception;

}

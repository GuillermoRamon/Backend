package com.example.BS9.estudiante.application.port;

import com.example.BS9.estudiante.domain.Estudiante;

import java.util.List;

public interface FindEstudianteService {
    public Estudiante findEstudianteById(int id) throws Exception;
    public List<Estudiante> findEstudiantes();
}

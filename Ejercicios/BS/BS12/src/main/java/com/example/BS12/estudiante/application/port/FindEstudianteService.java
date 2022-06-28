package com.example.BS12.estudiante.application.port;

import com.example.BS12.estudiante.domain.Estudiante;

import java.util.List;

public interface FindEstudianteService {
    public Estudiante findEstudianteById(int id) throws Exception;
    public List<Estudiante> findEstudiantes();
}

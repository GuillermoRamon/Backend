package com.example.EJ3.estudiante.application.port;

import com.example.EJ3.estudiante.domain.Estudiante;

import java.util.List;

public interface FindEstudianteService {
    public Estudiante findEstudianteById(int id) throws Exception;
    public List<Estudiante> findEstudiantes();
}

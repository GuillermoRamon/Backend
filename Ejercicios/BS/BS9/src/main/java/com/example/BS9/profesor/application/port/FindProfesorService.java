package com.example.BS9.profesor.application.port;

import com.example.BS9.profesor.domain.Profesor;

import java.util.List;

public interface FindProfesorService {
    public Profesor findProfesorById(int id) throws Exception;

    public List<Profesor> findAllProfesores();

}

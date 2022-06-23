package com.example.EJ3.profesor.application.port;

import com.example.EJ3.profesor.domain.Profesor;

public interface FindProfesorService {
    public Profesor findProfesorById(int id) throws Exception;
}

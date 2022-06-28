package com.example.BS9.asignatura.application;

import com.example.BS9.asignatura.application.port.FindAsignaturaService;
import com.example.BS9.asignatura.domain.EstudianteAsignatura;
import com.example.BS9.asignatura.infraestructure.repository.AsignaturaRepositorio;
import com.example.BS9.estudiante.domain.Estudiante;
import com.example.BS9.estudiante.infraestructure.repository.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindAsignaturaServiceImpl implements FindAsignaturaService {
    @Autowired
    AsignaturaRepositorio asignaturaRepositorio;
    @Autowired
    EstudianteRepositorio estudianteRepositorio;
    @Override
    public EstudianteAsignatura findAsignaturaById(int id) throws Exception {
        return asignaturaRepositorio.findById(id).orElseThrow(() -> new Exception("No se ha encontrado la asignatura"));
    }

    @Override
    public Estudiante findEstudianteById(int id) throws Exception {
        return estudianteRepositorio.findById(id).orElseThrow(() -> new Exception("estudiante no encontrado"));
    }
}

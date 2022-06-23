package com.example.EJ3.asignatura.application;

import com.example.EJ3.asignatura.application.port.FindAsignaturaService;
import com.example.EJ3.asignatura.domain.EstudianteAsignatura;
import com.example.EJ3.asignatura.infraestructure.repository.AsignaturaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindAsignaturaServiceImpl implements FindAsignaturaService {
    @Autowired
    AsignaturaRepositorio asignaturaRepositorio;
    @Override
    public EstudianteAsignatura findAsignaturaById(int id) throws Exception {
        return asignaturaRepositorio.findById(id).orElseThrow(() -> new Exception("No se ha encontrado la asignatura"));
    }
}

package com.example.EJ3.estudiante.application;

import com.example.EJ3.estudiante.application.port.FindEstudianteService;
import com.example.EJ3.estudiante.domain.Estudiante;
import com.example.EJ3.estudiante.infraestructure.repository.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindEstudianteServiceImpl implements FindEstudianteService {
    @Autowired
    EstudianteRepositorio estudianteRepositorio;

    @Override
    public Estudiante findEstudianteById(int id) throws Exception {
        return estudianteRepositorio.findById(id).orElseThrow(() -> new Exception("estudiante no encontrado"));
    }

    @Override
    public List<Estudiante> findEstudiantes() {
        return estudianteRepositorio.findAll();
    }
}

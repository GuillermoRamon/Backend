package com.example.BS12.profesor.application;

import com.example.BS12.profesor.application.port.FindProfesorService;
import com.example.BS12.profesor.domain.Profesor;
import com.example.BS12.profesor.infraestructure.repository.ProfesorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindProfesorServiceImpl implements FindProfesorService {
    @Autowired
    ProfesorRepositorio profesorRepositorio;

    @Override
    public Profesor findProfesorById(int id) throws Exception {
        return profesorRepositorio.findById(id).orElseThrow(() -> new Exception("Profesor no encontrado"));
    }

    @Override
    public List<Profesor> findAllProfesores() {
        return profesorRepositorio.findAll();
    }
}

package com.example.EJ3.asignatura.application;

import com.example.EJ3.asignatura.application.port.AddAsignaturaService;
import com.example.EJ3.asignatura.domain.EstudianteAsignatura;
import com.example.EJ3.asignatura.infraestructure.controller.dto.input.AsignaturaInputDTO;
import com.example.EJ3.asignatura.infraestructure.repository.AsignaturaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddAsignaturaServiceImpl implements AddAsignaturaService {

    @Autowired
    AsignaturaRepositorio asignaturaRepositorio;
    @Override
    public EstudianteAsignatura saveAsignatura(AsignaturaInputDTO asignaturaInputDTO) {
        return asignaturaRepositorio.save(new EstudianteAsignatura(asignaturaInputDTO));
    }
}

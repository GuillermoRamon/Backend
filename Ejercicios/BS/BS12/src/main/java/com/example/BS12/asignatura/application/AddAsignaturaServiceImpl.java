package com.example.BS12.asignatura.application;

import com.example.BS12.asignatura.application.port.AddAsignaturaService;
import com.example.BS12.asignatura.domain.EstudianteAsignatura;
import com.example.BS12.asignatura.infraestructure.controller.dto.input.AsignaturaInputDTO;
import com.example.BS12.asignatura.infraestructure.repository.AsignaturaRepositorio;
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

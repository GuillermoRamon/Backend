package com.example.EJ3.estudiante.application;

import com.example.EJ3.estudiante.application.port.UpdateEstudianteService;
import com.example.EJ3.estudiante.domain.Estudiante;
import com.example.EJ3.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.EJ3.estudiante.infraestructure.repository.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UpdateEstudianteServiceImpl implements UpdateEstudianteService {
    @Autowired
    EstudianteRepositorio estudianteRepositorio;


    @Override
    public Estudiante asignarAsignatura(EstudianteInputDTO estudianteInputDTO) {
        //En proceso
        Optional<Estudiante> estudent = estudianteRepositorio.findById(estudianteInputDTO.getIdStudent());
        return null;
    }

    @Override
    public Estudiante desasignarAsignatura(EstudianteInputDTO estudianteInputDTO) {
        return null;
    }
}

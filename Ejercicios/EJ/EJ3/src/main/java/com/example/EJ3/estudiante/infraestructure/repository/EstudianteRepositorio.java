package com.example.EJ3.estudiante.infraestructure.repository;

import com.example.EJ3.estudiante.domain.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepositorio extends JpaRepository <Estudiante, Integer> {
}

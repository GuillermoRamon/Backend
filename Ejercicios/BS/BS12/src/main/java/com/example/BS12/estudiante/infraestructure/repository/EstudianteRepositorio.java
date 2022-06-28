package com.example.BS12.estudiante.infraestructure.repository;

import com.example.BS12.estudiante.domain.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepositorio extends JpaRepository <Estudiante, Integer> {
    Estudiante findByPersona(int id);
}

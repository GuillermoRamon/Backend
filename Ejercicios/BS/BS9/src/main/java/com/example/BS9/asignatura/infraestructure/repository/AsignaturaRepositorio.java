package com.example.BS9.asignatura.infraestructure.repository;

import com.example.BS9.asignatura.domain.EstudianteAsignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignaturaRepositorio extends JpaRepository<EstudianteAsignatura, Integer> {
}

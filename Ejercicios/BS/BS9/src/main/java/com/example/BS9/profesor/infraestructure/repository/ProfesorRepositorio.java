package com.example.BS9.profesor.infraestructure.repository;

import com.example.BS9.profesor.domain.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepositorio extends JpaRepository <Profesor, Integer> {
}

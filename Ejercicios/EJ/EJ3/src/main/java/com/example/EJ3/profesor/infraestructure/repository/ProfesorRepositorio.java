package com.example.EJ3.profesor.infraestructure.repository;

import com.example.EJ3.profesor.domain.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepositorio extends JpaRepository <Profesor, Integer> {
}

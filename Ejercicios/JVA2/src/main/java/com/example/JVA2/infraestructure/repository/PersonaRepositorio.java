package com.example.JVA2.infraestructure.repository;

import com.example.JVA2.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepositorio extends JpaRepository <Persona, Integer> {
    List<Persona> findByUsuario(String usuario);
}

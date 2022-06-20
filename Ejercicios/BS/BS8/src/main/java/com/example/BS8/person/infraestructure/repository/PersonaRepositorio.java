package com.example.BS8.person.infraestructure.repository;

import com.example.BS8.person.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepositorio extends JpaRepository <Persona, Integer> {
    List<Persona> findByUsuario(String usuario);
}

package com.example.DBA1.infraestructure.repository;

import com.example.DBA1.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Integer> {
    List<Persona> findByUsuario(String usuario);
    List<Persona> getData(HashMap<String, Object> conditions);

    /*@Query("select u from Usuario u where u.nombre like :nombre order by u.nombre")
    List<Persona> buscaPorNombre(@Param("nombre") String nombre);*/

}

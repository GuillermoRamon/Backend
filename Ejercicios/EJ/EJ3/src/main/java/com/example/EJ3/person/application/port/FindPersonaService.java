package com.example.EJ3.person.application.port;

import com.example.EJ3.person.domain.Persona;
import com.example.EJ3.person.exception.NotFoundException404;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface FindPersonaService {
    public Persona findPerson(int id) throws NotFoundException404;
    public List<Persona> findPersonsByUsuario(String usuario);
    public List<Persona> findAllPersons();

}

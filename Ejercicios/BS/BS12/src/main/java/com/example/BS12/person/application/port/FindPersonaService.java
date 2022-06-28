package com.example.BS12.person.application.port;

import com.example.BS12.person.domain.Persona;
import com.example.BS12.person.exception.NotFoundException404;

import java.util.List;

public interface FindPersonaService {
    public Persona findPerson(int id) throws NotFoundException404;
    public List<Persona> findPersonsByUsuario(String usuario);
    public List<Persona> findAllPersons();

}

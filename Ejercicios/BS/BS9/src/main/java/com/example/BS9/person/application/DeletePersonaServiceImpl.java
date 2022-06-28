package com.example.BS9.person.application;

import com.example.BS9.person.application.port.DeletePersonaService;
import com.example.BS9.person.infraestructure.repository.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeletePersonaServiceImpl implements DeletePersonaService {
    @Autowired
    PersonaRepositorio personaRepositorio;
    @Override
    public void borrarPersonaId(int id) {
        personaRepositorio.deleteById(id);
    }
}

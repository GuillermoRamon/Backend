package com.example.BS9.asignatura.application;

import com.example.BS9.asignatura.application.port.DeleteAsignaturaService;
import com.example.BS9.asignatura.infraestructure.repository.AsignaturaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteASignaturaServiceImpl implements DeleteAsignaturaService {
    @Autowired
    AsignaturaRepositorio asignaturaRepositorio;
    @Override
    public void BorrarAsignatura(int id) {
        asignaturaRepositorio.deleteById(id);
    }
}

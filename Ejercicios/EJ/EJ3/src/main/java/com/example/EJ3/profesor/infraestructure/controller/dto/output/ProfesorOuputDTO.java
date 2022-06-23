package com.example.EJ3.profesor.infraestructure.controller.dto.output;

import com.example.EJ3.profesor.domain.Profesor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfesorOuputDTO {
    private Integer idProfesor;
    private Integer persona;
    private String coments;
    private String branch;

    public ProfesorOuputDTO(Profesor profesor){
        setIdProfesor(profesor.getIdProfesor());
        setPersona(profesor.getPersona().getIdPersona());
        setComents(profesor.getComents());
        setBranch(profesor.getBranch());
    }
}

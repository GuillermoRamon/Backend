package com.example.BS9.profesor.infraestructure.controller.dto.output;

import com.example.BS9.profesor.domain.Profesor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

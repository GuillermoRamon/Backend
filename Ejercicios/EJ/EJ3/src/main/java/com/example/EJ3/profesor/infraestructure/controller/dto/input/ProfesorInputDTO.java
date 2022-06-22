package com.example.EJ3.profesor.infraestructure.controller.dto.input;

import com.example.EJ3.person.domain.Persona;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Getter
@Setter
public class ProfesorInputDTO {
    private String idProfesor;
    private Integer persona;
    private String coments;
    private String branch;
}

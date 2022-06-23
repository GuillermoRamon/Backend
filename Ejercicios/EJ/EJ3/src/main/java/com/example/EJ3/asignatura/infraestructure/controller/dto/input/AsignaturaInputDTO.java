package com.example.EJ3.asignatura.infraestructure.controller.dto.input;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Setter
@Getter
@ToString
public class AsignaturaInputDTO {
    private Integer idAsignatura;
    private String asignatura;
    private String comment;
    private Date initialDate;
    private Date finishDate;
}

package com.example.EJ3.estudiante.infraestructure.controller.dto.input;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class EstudianteInputDTO {
    private Integer idStudent;
    private Integer persona;
    private Integer numHoursWeek;
    private String coments;
//    private Integer profesor;
    private String branch;
//    private List<EstudianteAsignatura> estudios;
}

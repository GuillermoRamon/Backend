package com.example.BS12.estudiante.infraestructure.controller.dto.input;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class EstudianteInputDTO {
    private Integer idStudent;
    private Integer persona;
    private Integer numHoursWeek;
    private String coments;
    private Integer profesor;
    private String branch;
    private List<Integer> estudios = new ArrayList<>();
}

package com.example.BS12.asignatura.infraestructure.controller.dto.output;

import com.example.BS12.asignatura.domain.EstudianteAsignatura;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class AsignaturaOuputDTO {
    private Integer idAsignatura;
    private String asignatura;
    private String comment;
    private Date initialDate;
    private Date finishDate;

    public AsignaturaOuputDTO(EstudianteAsignatura estudianteAsignatura){
        setIdAsignatura(estudianteAsignatura.getIdAsignatura());
        setAsignatura(estudianteAsignatura.getAsignatura());
        setComment(estudianteAsignatura.getComment());
        setInitialDate(estudianteAsignatura.getInitialDate());
        setFinishDate(estudianteAsignatura.getFinishDate());
    }
}

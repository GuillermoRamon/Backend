package com.example.EJ3.asignatura.domain;


import com.example.EJ3.asignatura.infraestructure.controller.dto.input.AsignaturaInputDTO;
import com.example.EJ3.estudiante.domain.Estudiante;
import com.example.EJ3.profesor.domain.Profesor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "estudios")
public class EstudianteAsignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idAsignatura;
    private String asignatura;
    private String comment;
    @Column( nullable = false)
    private Date initialDate;
    private Date finishDate;

    public EstudianteAsignatura(@Valid AsignaturaInputDTO asignaturaInputDTO){
        setIdAsignatura(asignaturaInputDTO.getIdAsignatura());
        setAsignatura(asignaturaInputDTO.getAsignatura());
        setComment(asignaturaInputDTO.getComment());
        setInitialDate(asignaturaInputDTO.getInitialDate());
        setFinishDate(asignaturaInputDTO.getFinishDate());
    }
}

package com.example.EJ3.asignatura.domain;


import com.example.EJ3.estudiante.domain.Estudiante;
import com.example.EJ3.profesor.domain.Profesor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
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
}

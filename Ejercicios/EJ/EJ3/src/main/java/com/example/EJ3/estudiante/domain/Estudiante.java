package com.example.EJ3.estudiante.domain;

import com.example.EJ3.asignatura.domain.EstudianteAsignatura;
import com.example.EJ3.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.EJ3.person.domain.Persona;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idStudent;
    @OneToOne
    @JoinColumn(name = "idPersona")
    private Persona persona;
    @Column( nullable = false)
    private Integer numHoursWeek;
    private String coments;
    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idProfesor")
    private Profesor profesor;*/
    @Column(nullable = false)
    private String branch;
    @OneToMany
    private List<EstudianteAsignatura> estudios;

    public Estudiante(EstudianteInputDTO estudianteInputDTO, Persona person) {
        setIdStudent(estudianteInputDTO.getIdStudent());
        setPersona(person);
        setNumHoursWeek(estudianteInputDTO.getNumHoursWeek());
        setComents(estudianteInputDTO.getComents());
//        this.profesor = estudianteInputDTO.getProfesor();
        setBranch(estudianteInputDTO.getBranch());
        this.estudios = new ArrayList<>();
    }
}

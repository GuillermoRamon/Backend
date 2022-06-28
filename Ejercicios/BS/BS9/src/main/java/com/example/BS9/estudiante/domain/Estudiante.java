package com.example.BS9.estudiante.domain;

import com.example.BS9.asignatura.domain.EstudianteAsignatura;
import com.example.BS9.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.BS9.person.domain.Persona;
import com.example.BS9.profesor.domain.Profesor;
import lombok.*;

import javax.persistence.*;
import javax.validation.Valid;
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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idProfesor")
    private Profesor profesor;
    @Column(nullable = false)
    private String branch;
    @OneToMany
    private List<EstudianteAsignatura> estudios;

    public Estudiante(@Valid EstudianteInputDTO estudianteInputDTO, Persona person, Profesor profe, List<EstudianteAsignatura> lista) {
        setIdStudent(estudianteInputDTO.getIdStudent());
        setPersona(person);
        setNumHoursWeek(estudianteInputDTO.getNumHoursWeek());
        setComents(estudianteInputDTO.getComents());
        setProfesor(profe);
        setBranch(estudianteInputDTO.getBranch());
        this.estudios = new ArrayList<>(lista);
    }
}

package com.example.EJ3.profesor.domain;

import com.example.EJ3.estudiante.domain.Estudiante;
import com.example.EJ3.person.domain.Persona;
import com.example.EJ3.profesor.infraestructure.controller.dto.input.ProfesorInputDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "profesores")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String idProfesor;
    @OneToOne
    @JoinColumn(name = "idPersona")
    private Persona persona;
    private String coments;
    @Column(nullable = false)
    private String branch;

    public Profesor(ProfesorInputDTO profesorInputDTO, Persona persona){
        setIdProfesor(profesorInputDTO.getIdProfesor());
        setPersona(persona);
        setComents(profesorInputDTO.getComents());
        setBranch(profesorInputDTO.getBranch());
    }
}

package com.example.BS9.profesor.domain;

import com.example.BS9.person.domain.Persona;
import com.example.BS9.profesor.infraestructure.controller.dto.input.ProfesorInputDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "profesores")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idProfesor;
    @OneToOne
    @JoinColumn(name = "idPersona")
    private Persona persona;
    private String coments;
    @Column(nullable = false)
    private String branch;

    public Profesor(@Valid ProfesorInputDTO profesorInputDTO, Persona person){
        setIdProfesor(profesorInputDTO.getIdProfesor());
        setPersona(person);
        setComents(profesorInputDTO.getComents());
        setBranch(profesorInputDTO.getBranch());
    }
}

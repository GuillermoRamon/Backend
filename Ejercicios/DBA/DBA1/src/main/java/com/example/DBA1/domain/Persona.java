package com.example.DBA1.domain;

import com.example.DBA1.infraestructure.controller.dto.PersonaInputDTO;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idPersona;
    private String usuario;
    private String password;
    private String name;
    private String surname;
    private String companyEmail;
    private String personalEmail;
    private String city;
    private boolean active;
    @Temporal(TemporalType.DATE)
    private Date createDate;
    private String imagenUrl;
    private Date terminationDate;

    public Persona(PersonaInputDTO personaInPutDto) {
        setIdPersona(personaInPutDto.idPersona());
        setUsuario(personaInPutDto.usuario());
        setPassword(personaInPutDto.password());
        setName(personaInPutDto.name());
        setSurname(personaInPutDto.surname());
        setCompanyEmail(personaInPutDto.companyEmail());
        setPersonalEmail(personaInPutDto.personalEmail());
        setCity(personaInPutDto.city());
        setActive(personaInPutDto.active());
        setCreateDate(personaInPutDto.createDate());
        setImagenUrl(personaInPutDto.imagenUrl());
        setTerminationDate(personaInPutDto.terminationDate());
    }
}

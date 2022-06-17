package com.example.BP1.person.domain;

import com.example.BP1.person.infraestructure.controller.dto.input.PersonaInputDTO;
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
    private Date createDate;
    private String imagenUrl;
    private Date terminationDate;

    public Persona(PersonaInputDTO personaInPutDto) {
        setIdPersona(personaInPutDto.getIdPersona());
        setUsuario(personaInPutDto.getUsuario());
        setPassword(personaInPutDto.getPassword());
        setName(personaInPutDto.getName());
        setSurname(personaInPutDto.getSurname());
        setCompanyEmail(personaInPutDto.getCompanyEmail());
        setPersonalEmail(personaInPutDto.getPersonalEmail());
        setCity(personaInPutDto.getCity());
        setActive(personaInPutDto.isActive());
        setCreateDate(personaInPutDto.getCreateDate());
        setImagenUrl(personaInPutDto.getImagenUrl());
        setTerminationDate(personaInPutDto.getTerminationDate());
    }
}

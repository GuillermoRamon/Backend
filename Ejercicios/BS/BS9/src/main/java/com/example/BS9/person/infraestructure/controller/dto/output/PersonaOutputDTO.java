package com.example.BS9.person.infraestructure.controller.dto.output;

import com.example.BS9.person.domain.Persona;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class PersonaOutputDTO {
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

    public PersonaOutputDTO(Persona persona) {
        setIdPersona(persona.getIdPersona());
        setUsuario(persona.getUsuario());
        setPassword(persona.getPassword());
        setName(persona.getName());
        setSurname(persona.getSurname());
        setCompanyEmail(persona.getCompanyEmail());
        setPersonalEmail(persona.getPersonalEmail());
        setCity(persona.getCity());
        setActive(persona.isActive());
        setCreateDate(persona.getCreateDate());
        setImagenUrl(persona.getImagenUrl());
        setTerminationDate(persona.getTerminationDate());
    }
}

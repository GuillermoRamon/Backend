package com.example.BS9.person.infraestructure.controller.dto.input;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class PersonaInputDTO {
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
}

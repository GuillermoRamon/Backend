package com.example.DBA1.infraestructure.controller.dto;

import java.util.Date;

public record PersonaInputDTO(int idPersona, String usuario, String password,  String name, String surname,
                              String companyEmail,  String personalEmail, String city, boolean active, Date createDate,
                              String imagenUrl, Date terminationDate) {
}

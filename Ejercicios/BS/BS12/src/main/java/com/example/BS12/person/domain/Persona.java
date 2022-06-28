package com.example.BS12.person.domain;

import com.example.BS12.person.infraestructure.controller.dto.input.PersonaInputDTO;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "personas")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idPersona;
    @Size(min = 6, max = 10, message = "Longitud de usuario no puede ser superior a 10 caracteres e inderior a 6 caracteres")
    @Column(nullable = false)
    private String usuario;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String name;
    private String surname;
    @Column(nullable = false)
    private String companyEmail;
    @Column(nullable = false)
    private String personalEmail;
    @Column(nullable = false)
    private String city;
    private boolean active;
    @Column(nullable = false)
    private Date createDate;
    private String imagenUrl;
    private Date terminationDate;

    public Persona(PersonaInputDTO personaInPutDto) {
        setIdPersona(personaInPutDto.getIdPersona());
        setUsuario(personaInPutDto.getUsuario());
        setPassword(personaInPutDto.getPassword());
        setName(personaInPutDto.getName());
        setSurname(personaInPutDto.getSurname());
        setCompanyEmail(personaInPutDto.getCompany_email());
        setPersonalEmail(personaInPutDto.getPersonal_email());
        setCity(personaInPutDto.getCity());
        setActive(personaInPutDto.isActive());
        setCreateDate(personaInPutDto.getCreated_date());
        setImagenUrl(personaInPutDto.getImagen_url());
        setTerminationDate(personaInPutDto.getTermination_date());
    }
}

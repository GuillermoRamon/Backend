package com.example.EJ3.estudiante.infraestructure.controller.dto.output;

import com.example.EJ3.asignatura.domain.EstudianteAsignatura;
import com.example.EJ3.estudiante.domain.Estudiante;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;
@Setter
@Getter
public class EstudianteOutputFullDTO {
    private Integer idStudent;
//    private Integer persona;
    private Integer numHoursWeek;
    private String coments;
    //    private Profesor profesor;
    private String branch;
    private List<EstudianteAsignatura> estudios;

    private Integer idPersona;
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


    public EstudianteOutputFullDTO(Estudiante estudiante) {
        setIdStudent(estudiante.getIdStudent());
        setNumHoursWeek(estudiante.getNumHoursWeek());
        setComents(estudiante.getComents());
//        this.profesor = estudiante.getProfesor();
        setBranch(estudiante.getBranch());
        setEstudios(estudiante.getEstudios());

        setIdPersona(estudiante.getPersona().getIdPersona());
        setUsuario(estudiante.getPersona().getUsuario());
        setPassword(estudiante.getPersona().getPassword());
        setName(estudiante.getPersona().getName());
        setSurname(estudiante.getPersona().getSurname());
        setCompanyEmail(estudiante.getPersona().getCompanyEmail());
        setPersonalEmail(estudiante.getPersona().getPersonalEmail());
        setCity(estudiante.getPersona().getCity());
        setActive(estudiante.getPersona().isActive());
        setCreateDate(estudiante.getPersona().getCreateDate());
        setImagenUrl(estudiante.getPersona().getImagenUrl());
        setTerminationDate(estudiante.getPersona().getTerminationDate());



    }
}

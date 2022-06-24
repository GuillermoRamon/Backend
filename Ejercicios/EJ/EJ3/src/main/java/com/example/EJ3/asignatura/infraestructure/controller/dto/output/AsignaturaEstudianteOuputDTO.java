package com.example.EJ3.asignatura.infraestructure.controller.dto.output;

import com.example.EJ3.estudiante.domain.Estudiante;
import com.example.EJ3.person.domain.Persona;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class AsignaturaEstudianteOuputDTO {
    private Integer idStudent;
    private Integer numHoursWeek;
    private String coments;
    private Integer profesor;
    private String branch;
    private List<Integer> estudios = new ArrayList<>();

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

    public AsignaturaEstudianteOuputDTO(Estudiante estudiante){
        setIdStudent(estudiante.getIdStudent());
        setNumHoursWeek(estudiante.getNumHoursWeek());
        setComents(estudiante.getComents());
        setProfesor(estudiante.getProfesor().getIdProfesor());
        setBranch(estudiante.getBranch());
        for (int i = 0; i < estudiante.getEstudios().size();i++){
            estudios.add(estudiante.getEstudios().get(i).getIdAsignatura());
        }

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

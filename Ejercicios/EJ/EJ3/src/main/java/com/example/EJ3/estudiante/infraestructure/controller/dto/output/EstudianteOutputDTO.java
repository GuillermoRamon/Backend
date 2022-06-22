package com.example.EJ3.estudiante.infraestructure.controller.dto.output;

import com.example.EJ3.asignatura.domain.EstudianteAsignatura;
import com.example.EJ3.estudiante.domain.Estudiante;
import com.example.EJ3.person.domain.Persona;
import com.example.EJ3.profesor.domain.Profesor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class EstudianteOutputDTO {
    private Integer idStudent;
    private Integer persona;
    private Integer numHoursWeek;
    private String coments;
//    private Profesor profesor;
    private String branch;
    private List<EstudianteAsignatura> estudios;

    public EstudianteOutputDTO(Estudiante estudiante) {
        setIdStudent(estudiante.getIdStudent());
        setPersona(estudiante.getPersona().getIdPersona());
        setNumHoursWeek(estudiante.getNumHoursWeek());
        setComents(estudiante.getComents());
//        this.profesor = estudiante.getProfesor();
        setBranch(estudiante.getBranch());
        setEstudios(estudiante.getEstudios());
    }
}

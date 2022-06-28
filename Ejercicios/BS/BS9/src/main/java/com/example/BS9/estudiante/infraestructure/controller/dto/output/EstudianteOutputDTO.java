package com.example.BS9.estudiante.infraestructure.controller.dto.output;

import com.example.BS9.estudiante.domain.Estudiante;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class EstudianteOutputDTO {
    private Integer idStudent;
    private Integer persona;
    private Integer numHoursWeek;
    private String coments;
    private Integer profesor;
    private String branch;
    private List<Integer> estudios = new ArrayList<>();

    public EstudianteOutputDTO(Estudiante estudiante) {
        setIdStudent(estudiante.getIdStudent());
        setPersona(estudiante.getPersona().getIdPersona());
        setNumHoursWeek(estudiante.getNumHoursWeek());
        setComents(estudiante.getComents());
        setProfesor(estudiante.getProfesor().getIdProfesor());
        setBranch(estudiante.getBranch());
        for (int i = 0; i < estudiante.getEstudios().size();i++){
            estudios.add(estudiante.getEstudios().get(i).getIdAsignatura());
        }
    }
}

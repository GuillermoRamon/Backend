package com.example.RS1.clase;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Persona {

    private int id;
    private String nombre;
    private int edad;
    private String poblacion;

}

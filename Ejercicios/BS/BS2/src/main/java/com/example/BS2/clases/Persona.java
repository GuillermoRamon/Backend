package com.example.BS2.clases;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Persona {
    private String nombre;
    private int edad;
    private String poblacion;
}

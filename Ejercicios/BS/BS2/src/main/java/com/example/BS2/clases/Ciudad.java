package com.example.BS2.clases;

import lombok.*;

import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ciudad {
    private String nombre;
    private int num_hab;
}

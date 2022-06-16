package com.example.BS3;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SegundaClase {

    @PostConstruct
    public String mostrarMensaje(){
        String mensaje = "Hola desde la segunda clase";
        System.out.println(mensaje);
        return mensaje;
    }
}

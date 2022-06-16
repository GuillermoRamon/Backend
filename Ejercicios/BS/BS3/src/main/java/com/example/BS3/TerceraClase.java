package com.example.BS3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TerceraClase {

    @Autowired
    MensajeService ms;

    @Bean
    CommandLineRunner ejecutame(Bs3Application main)
    {
        return p ->
        {
            System.out.println("Hola desde la tercera clase");
            System.out.println("---------------------2 parte-----------------------");
            ms.getMensajes();
            main.run();
        };
    }
}

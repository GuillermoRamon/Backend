package com.example.BS4.clase;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:myConfiguration.properties")
@Profile("Perfil2")
public class Perfil2 implements Perfiles{

    String perfil2;
    @Override
    public void miFuncion() {
        perfil2 = "perfil 2";
        System.out.println("hola desde " + perfil2);
    }
}

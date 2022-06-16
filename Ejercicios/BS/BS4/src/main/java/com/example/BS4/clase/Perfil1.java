package com.example.BS4.clase;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:myConfiguration.properties")
@Profile("Perfil1")
public class Perfil1 implements Perfiles {

    String perfil1;
    @Override
    public void miFuncion() {

        perfil1 = "perfil 1";
        System.out.println("hola desde " + perfil1);
    }
}

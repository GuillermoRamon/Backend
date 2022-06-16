package com.example.BS4.controller;

import com.example.BS4.clase.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationPropertiesScan()
public class Controlador1 {

    @Autowired
    Variables variables;
    @Autowired
    Url url;
    @Autowired
    Valor valor;
    @Autowired
    Perfiles p;

    @GetMapping("/valores/")
        public String getValoresProp(){
        return "valor de var1 es: " + variables.getVar1() + " valor de my.var2 es: " + variables.getVar2();
    }

    @GetMapping("/VAR3/")
    public String getValorVar3(){
        return "valor de var3 es: " + variables.getVar3();
    }

    @GetMapping("/parametros/")
    public String getUrlPassword(){
        return "url: " + url.getUrl() + " password: " + url.getPassword();
    }

    @GetMapping("/miConfiguracion/")
    public String getValores(){
        return "valor1: " + valor.getValor1() + " valor2: " + valor.getValor2();
    }

    @GetMapping("/Perfil/")
    void getPerfil(){
        p.miFuncion();
    }
}

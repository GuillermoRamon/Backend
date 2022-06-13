package com.example.BS4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationPropertiesScan
public class Controlador1 {

    @Autowired
    Variables variables;

    @GetMapping("/valores/")
        public String getValoresProp(){
        return "valor de var1 es: " + variables.getVar1() + " valor de my.var2 es: " + variables.getVar2();
    }

    @GetMapping("/VAR3/")
    public String getValorVar3(){
        return "valor de var3 es: " + variables.getVar3();
    }

}

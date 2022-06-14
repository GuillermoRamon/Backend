package com.example.BS5.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Slf4j
public class Controlador1 {

    @GetMapping("/log/")
    public String logger(){

        log.error("Esto es un error del controller");
        log.warn("Esto es un mensaje de warning del controller");

        return "Terminado";
    }

}

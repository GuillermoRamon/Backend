package com.example.BS12.person.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class UnprocesableException422 extends RuntimeException{
    public UnprocesableException422(String message){super(message);}
}

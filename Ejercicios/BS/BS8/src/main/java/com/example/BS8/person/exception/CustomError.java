package com.example.BS8.person.exception;

import java.util.Date;

public class CustomError {
    private Date timestamp;
    private String mensaje;
    private String HttpCode;
    public CustomError(Date timestamp, String mensaje, String httpCode) {
        this.timestamp = timestamp;
        this.mensaje = mensaje;
        HttpCode = httpCode;
    }

}

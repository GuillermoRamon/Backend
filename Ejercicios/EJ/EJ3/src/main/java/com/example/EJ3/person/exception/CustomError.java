package com.example.EJ3.person.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
@Data
@AllArgsConstructor
public class CustomError {
    private Date timestamp;
    private String mensaje;
    private String detail;
    private String HttpCode;


}

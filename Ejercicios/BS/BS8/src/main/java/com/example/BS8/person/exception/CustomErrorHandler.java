package com.example.BS8.person.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

public class CustomErrorHandler {
    public final ResponseEntity<CustomError> notFound(NotFoundException404 notFoundException404, WebRequest request){
        CustomError customError = new CustomError(new Date(), notFoundException404.getMessage(), HttpStatus.NOT_FOUND.getReasonPhrase());
        return new ResponseEntity<CustomError>(customError, HttpStatus.NOT_FOUND);
    }
}

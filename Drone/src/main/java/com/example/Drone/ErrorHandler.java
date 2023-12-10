package com.example.Drone;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class ErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleGlobalExceptions(Exception ex) {
        // Handle general exceptions
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Internal Server Error: " + ex.getMessage());
    }

    @ExceptionHandler({NoSuchElementException.class, NullPointerException.class})
    public ResponseEntity<Object> handleNotFoundExceptions(Exception ex) {
        // Handle not found exceptions
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Resource Not Found: " + ex.getMessage());
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Object> handleBadRequestExceptions(Exception ex) {
        // Handle bad request exceptions
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body("Bad Request: " + ex.getMessage());
    }
}


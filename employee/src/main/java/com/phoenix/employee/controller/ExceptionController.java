package com.phoenix.employee.controller;

import com.phoenix.employee.dto.ErrorResponseDto;
import com.phoenix.employee.exception.EmployeeNotFoundException;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponseDto> InternalServerError(){
       ErrorResponseDto error = new ErrorResponseDto(
                "Something went wrong",
                HttpStatus.INTERNAL_SERVER_ERROR.value()
       );
       return new ResponseEntity<>(error,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<ErrorResponseDto> EmployeeNotFoundException(EmployeeNotFoundException ex){
        ErrorResponseDto error = new ErrorResponseDto(
                ex.getMessage(),
                HttpStatus.NOT_FOUND.value()
        );
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }
}

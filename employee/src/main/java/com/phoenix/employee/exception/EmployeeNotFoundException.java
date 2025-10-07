package com.phoenix.employee.exception;


public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(String s){
        super(s);
    }
}

package com.phoenix.crud.controller;

import com.phoenix.crud.service.StudentService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    

}

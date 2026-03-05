package com.phoenix.MongoDemo.controller;

import com.phoenix.MongoDemo.model.Student;
import com.phoenix.MongoDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public Student createStudent (@RequestBody Student student){
        return service.saveStudent(student);
    }

    @GetMapping
    public List<Student> getStudents(){
        return service.getAllStudents();
    }



}

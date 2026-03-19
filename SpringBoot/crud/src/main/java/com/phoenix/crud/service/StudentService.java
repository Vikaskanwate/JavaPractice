package com.phoenix.crud.service;

import com.phoenix.crud.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService studentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;x
    }


}

package com.phoenix.MongoDemo.service;

import com.phoenix.MongoDemo.model.Student;
import com.phoenix.MongoDemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student saveStudent (Student student){
        return repository.save(student);
    }

    public List<Student> getAllStudents(){
        return repository.findAll();
    }
}

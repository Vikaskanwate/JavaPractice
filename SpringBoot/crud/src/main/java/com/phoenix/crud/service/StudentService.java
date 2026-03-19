package com.phoenix.crud.service;

import com.phoenix.crud.model.Student;
import com.phoenix.crud.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public boolean addStudent(Student student){
        if(student == null)
            return false;
        try{
            studentRepository.save(student);
            return true;
        }catch (Exception e){
            return false;
        }

    }

}

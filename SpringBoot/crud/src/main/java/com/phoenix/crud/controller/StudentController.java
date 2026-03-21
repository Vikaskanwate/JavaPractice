package com.phoenix.crud.controller;

import com.phoenix.crud.model.Student;
import com.phoenix.crud.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<List<Student>> getStudent(){
            return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<String> saveStudent( @RequestBody Student student) {
        if (studentService.addStudent(student)) {
            return ResponseEntity.status(HttpStatus.CREATED).body("Data added");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Not added");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
        return new ResponseEntity<>(studentService.getStudentById(id),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudentById(@PathVariable Long id){
        if(studentService.deleteStudentById(id))
            return new ResponseEntity<>("student deleted successfully",HttpStatus.OK);
        return new ResponseEntity<>("id not found",HttpStatus.NOT_FOUND);
    }


}

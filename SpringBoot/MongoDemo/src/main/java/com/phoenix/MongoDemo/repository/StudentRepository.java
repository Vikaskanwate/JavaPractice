package com.phoenix.MongoDemo.repository;

import com.phoenix.MongoDemo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,String> {

}

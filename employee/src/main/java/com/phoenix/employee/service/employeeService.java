package com.phoenix.employee.service;

import com.phoenix.employee.model.employee;
import com.phoenix.employee.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class employeeService {

    private final EmployeeRepository employeeRepository;

    public employeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public List<employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

}


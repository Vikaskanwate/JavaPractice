package com.phoenix.employee.service;

import com.phoenix.employee.model.Employee;
import com.phoenix.employee.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    public Employee addEmployee(Employee emp){
        return employeeRepository.save(emp);
    }

    public Employee getEmployee(Long id){
//        Optional<Employee> emp =  employeeRepository.findById(id);
//        return emp.orElse(null);
        return employeeRepository.findById(id).orElse(null);
    }

}


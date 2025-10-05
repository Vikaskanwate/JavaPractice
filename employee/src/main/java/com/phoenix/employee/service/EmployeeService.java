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
        return employeeRepository.findById(id).orElse(null);
    }

    public void deleteEmployee(Long id){
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent()){
            var emp = employee.get();
            employeeRepository.delete(emp);
        }
        else
            throw new RuntimeException("employee not found");
    }

    public Employee updateEmployee(){
        return null;
    }

}




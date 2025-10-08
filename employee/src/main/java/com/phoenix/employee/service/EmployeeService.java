package com.phoenix.employee.service;

import com.phoenix.employee.exception.EmployeeNotFoundException;
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
        return employeeRepository.findById(id).orElseThrow(()-> new EmployeeNotFoundException("Employee not found"));
    }

    public void deleteEmployee(Long id){
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent()){
            var emp = employee.get();
            employeeRepository.delete(emp);
        }
        else
            throw new EmployeeNotFoundException("employee not found");
    }

    public Employee updateEmployee(Long id, Employee updateEmp){
        Optional<Employee> emp = employeeRepository.findById(id);
        if(emp.isPresent()){
            var emp1 = emp.get();
            emp1.setName(updateEmp.getName());
            emp1.setDepartment(updateEmp.getDepartment());
            emp1.setSalary(updateEmp.getSalary());
            emp1.setDesignation(updateEmp.getDesignation());
            return employeeRepository.save(emp1);
        }
        else
            throw new EmployeeNotFoundException("Employee with Id not found");
    }

}




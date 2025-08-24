package com.phoenix.employee.repository;

import com.phoenix.employee.model.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<employee,Long> {

}

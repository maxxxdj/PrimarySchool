package com.example.demo.repositories.Service;

import com.example.demo.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getAllEmployeesByFirstName(String name);
    Employee addEmployee(Employee employee);
    Employee getAllEmployeesById(Long id);
}
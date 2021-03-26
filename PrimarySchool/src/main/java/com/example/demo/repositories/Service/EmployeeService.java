package com.example.demo.repositories.Service;

import com.example.demo.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public List<Employee> getAllEmployeesByFirstName(String name);
    public Employee addEmployee(Employee employee);
}
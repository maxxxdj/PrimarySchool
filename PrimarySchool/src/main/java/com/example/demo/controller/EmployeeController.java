package com.example.demo.controller;

import com.example.demo.entities.Employee;
import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.repositories.Service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @PostMapping("/getAllByFirstName")
    public List<Employee> getAllEmployeesByFirstName(@RequestBody String firstName){
        return employeeService.getAllEmployeesByFirstName(firstName);
    }

    @PostMapping("/createEmployee")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }
}
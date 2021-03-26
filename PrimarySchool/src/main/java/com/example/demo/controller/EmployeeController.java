package com.example.demo.controller;

import com.example.demo.entities.Employee;
import com.example.demo.repositories.Service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @GetMapping("/getAllByFirstName/{firstName}")
    public List<Employee> getAllEmployeesByFirstName(@PathVariable String firstName) {
        return employeeService.getAllEmployeesByFirstName(firstName);
    }

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping("/createEmployee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @RequestMapping("/getById/{id}")
    public Employee getAllEmployeesById(@PathVariable Long id) {
        return employeeService.getAllEmployeesById(id);
    }
}
package com.example.demo;

import com.example.demo.entities.Employee;
import com.example.demo.repositories.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class PrimarySchoolApplication {

    public PrimarySchoolApplication(EmployeeRepository repository){

    }
    public static void main(String[] args) {
        SpringApplication.run(PrimarySchoolApplication.class, args);
    }

}

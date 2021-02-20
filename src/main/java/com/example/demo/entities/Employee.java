package com.example.demo.entities;

import com.example.demo.enums.JobTitle;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity(name = "employees")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private long id;
    private String firstName;
    private String lastName;
    private double salary;
    private JobTitle jobTitle;
    private String email;


    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name="first_name", length = 25)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Column(name="last_name",length = 25)
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String secondName) {
        this.lastName = secondName;
    }

    @Column(name="salary")
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Column(name = "job_title",length = 15)
    @Enumerated(EnumType.STRING)
    public JobTitle getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(JobTitle title) {
        this.jobTitle = title;
    }

    @Column(name="email")
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
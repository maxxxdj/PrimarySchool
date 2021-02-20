package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="teachers")
@NoArgsConstructor
@AllArgsConstructor
public class Teacher extends Employee{

    private int lessons;


    @Column(name = "lessons")
    public int getLessons() {
        return lessons;
    }

    public void setLessons(int lessons) {
        this.lessons = lessons;
    }
}
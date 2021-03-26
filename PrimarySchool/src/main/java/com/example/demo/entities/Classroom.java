package com.example.demo.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "classroom")
public class Classroom {
    @Id
    private int number;
    private int floor;

    @Transient
    @OneToMany(targetEntity = Teacher.class,mappedBy = "room",fetch = FetchType.EAGER)
    private List<Teacher> teachers = new ArrayList<>();


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
    @Transient
    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
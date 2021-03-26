package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="teachers")
@NoArgsConstructor
@AllArgsConstructor
public class Teacher extends Employee{

    private int lessons;
    @Transient
    @ManyToOne
    private Classroom room = new Classroom();

    public int getLessons() {
        return lessons;
    }

    public void setLessons(int lessons) {
        this.lessons = lessons;
    }

    @Transient
    @Column(name = "classroom")
    public Classroom getRoom() {
        return room;
    }

    public void setRoom(Classroom room) {
        this.room = room;
    }
}
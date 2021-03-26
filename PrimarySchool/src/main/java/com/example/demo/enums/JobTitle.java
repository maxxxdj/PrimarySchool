package com.example.demo.enums;

public enum JobTitle {
    TEACHER("Teacher"),
    ELECTRICIAN("Electrician"),
    CLEANER("Cleaner"),
    COOK("Cook");

    private final String name;
    JobTitle(String name){
        this.name = name;
    }
}

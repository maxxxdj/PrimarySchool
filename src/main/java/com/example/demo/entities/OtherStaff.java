package com.example.demo.entities;

import com.example.demo.enums.JobTitle;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name="other_staff")
@SuperBuilder
@NoArgsConstructor
public class OtherStaff extends Employee{

}
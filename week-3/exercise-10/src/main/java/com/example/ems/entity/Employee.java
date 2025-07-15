package com.example.ems.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.*;

import java.time.LocalDate;

@Entity
@DynamicInsert
@DynamicUpdate
@BatchSize(size = 5)
@Where(clause = "active = true")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String role;
    private boolean active = true;

    @Formula("(year(curdate()) - year(hire_date))")
    private int yearsOfExperience;

    private LocalDate hireDate;

    // Getters and setters
}

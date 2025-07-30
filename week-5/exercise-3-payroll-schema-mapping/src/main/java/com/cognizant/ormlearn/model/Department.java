package com.cognizant.ormlearn.model;

import jakarta.persistence.*;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "dp_name")
    private String name;

    // Getters and Setters

    @Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + "]";
    }
}

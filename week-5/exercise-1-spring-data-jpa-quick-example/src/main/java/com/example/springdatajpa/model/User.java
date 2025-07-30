package com.example.springdatajpa.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public User() {}
    public User(String name) {
        this.name = name;
    }

    // Getters and setters
}

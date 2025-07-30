package com.cognizant.ormlearn.model;

import jakarta.persistence.*;

@Entity
@Table(name = "skill")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "sk_name")
    private String name;

    // Getters and Setters

    @Override
    public String toString() {
        return "Skill [id=" + id + ", name=" + name + "]";
    }
}

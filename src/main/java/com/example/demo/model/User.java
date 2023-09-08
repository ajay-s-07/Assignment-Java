package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String role; // customer
    private String email;
    private String password;

    // Getters and setters

}


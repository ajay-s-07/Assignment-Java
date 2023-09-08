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

    // Constraints:
    // - 'name' and 'email' are required and cannot be null.
    // - 'email' must be unique (no duplicate emails allowed).

    // Relationships:
    // - User can have multiple enrollments in courses, that is @OneToMany relationship.

    // Data Types:
    // - 'id' is of type Integer.
    // - 'name', 'email', 'password', and 'role' are of type String.

}


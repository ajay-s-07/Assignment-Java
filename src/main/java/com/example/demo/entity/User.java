package com.example.demo.entity;

import com.example.demo.enums.Role;
import jakarta.persistence.*;
import lombok.*;

@Data

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Role role; // customer

    private String email;

    private String contact_no;

    // Constraints:
    // - 'name' and 'email' are required and cannot be null.
    // - 'email' must be unique (no duplicate emails allowed).

    // Relationships:
    // - User can have multiple enrollments in courses, that is @OneToMany relationship.

    // Data Types:
    // - 'id' is of type Integer.
    // - 'name', 'email', 'password', and 'role' are of type String.

}


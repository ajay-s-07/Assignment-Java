package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    private String instructor;
    private double price;
    private String schedule; // Date and time details
    private String[] topics; // Array of String of size 3 for 3 courses offered.
    private String zoomLink;

    // Constraints:
    // - 'title', 'description', 'instructor', 'price', 'schedule', 'topics', and 'zoomLink' are required and cannot be null.

    // Relationships:
    // - Course can have multiple enrollments, define a @OneToMany relationship.
    // - Course can have multiple class sessions, define a @OneToMany relationship.

    // Data Types:
    // - 'id' is of type Integer.
    // - 'title', 'description', 'instructor', 'schedule', and 'zoomLink' are of type String.
    // - 'topics' is an Array of String.
    // - 'price' is of type double.
}

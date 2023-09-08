package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
    private Date enrollmentDate;
    private String paymentStatus;


    // Constraints:
    // - 'paymentStatus' is required and cannot be null.

    // Relationships:
    // - Enrollment belongs to a User, that is @ManyToOne relationship.
    // - Enrollment belongs to a Course, that is @ManyToOne relationship.

    // Data Types:
    // - 'id' is of type Integer.
    // - 'enrollmentDate' is of type Date.
    // - 'paymentStatus' is of type String.
}


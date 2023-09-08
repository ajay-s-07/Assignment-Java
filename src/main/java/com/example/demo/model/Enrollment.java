package com.example.demo.model;


import jakarta.persistence.*;
import java.util.*;

@Entity
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
    // Getters and setters
}


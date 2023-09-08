package com.example.demo.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
    private double amount;
    private Date paymentDate;
    private String paymentStatus;
    private String paymentMethod;
    // Getters and setters
}

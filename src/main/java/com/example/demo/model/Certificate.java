package com.example.demo.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
    private Date issueDate;
    private String downloadLink;
    // Getters and setters
}


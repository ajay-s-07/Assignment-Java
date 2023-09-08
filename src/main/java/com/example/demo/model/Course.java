package com.example.demo.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    private String instructor;
    private double price;
    private String schedule; // Date and time details
    private String topics; // Comma-separated topics
    private String zoomLink;
    // Getters and setters
}

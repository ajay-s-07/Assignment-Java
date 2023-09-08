package com.example.demo.model;


import jakarta.persistence.*;
import java.util.*;

@Entity
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
    private Date date;
    private String time;
    private String topic;
    private String zoomLink;
    private String recordingLink;
    // Getters and setters
}


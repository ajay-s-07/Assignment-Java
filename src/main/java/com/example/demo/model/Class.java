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


    // Constraints:
    // - 'topic' is required and cannot be null.

    // Relationships:
    // - Class belongs to a Course, so its a @ManyToOne relationship.

    // Data Types:
    // - 'id' is of type Integer.
    // - 'date' is of type Date.
    // - 'time', 'topic', 'zoomLink', and 'recordingLink' are of type String.

}


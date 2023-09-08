package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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


    // Constraints:
    // - 'downloadLink' is required and cannot be null.

    // Relationships:
    // - Certificate belongs to a User, we can define it @ManyToOne relationship.
    // - Certificate belongs to a Course, that is @ManyToOne relationship.

    // Data Types:
    // - 'id' is of type Integer.
    // - 'issueDate' is of type Date.
    // - 'downloadLink' is of type String.
}

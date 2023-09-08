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


    // Constraints:
    // - 'paymentStatus' and 'paymentMethod' are required and cannot be null.

    // Relationships:
    // - Payment belongs to a User, define a @ManyToOne relationship.
    // - Payment belongs to a Course, define a @ManyToOne relationship.

    // Data Types:
    // - 'id' is of type Integer.
    // - 'amount' is of type double.
    // - 'paymentDate' is of type Date.
    // - 'paymentStatus' and 'paymentMethod' are of type String.
}

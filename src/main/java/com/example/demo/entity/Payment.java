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

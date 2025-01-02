package com.mostafa.Clinic.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private String description;
    @ManyToOne
    @JoinColumn(name = "patient_id",nullable = false)
    private Patient patient;
    @ManyToOne
    @JoinColumn(name = "doctor_id",nullable = false)
    private Doctor doctor;
}

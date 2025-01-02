package com.mostafa.Clinic.entity;

import com.mostafa.Clinic.entity.enums.Gender;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(nullable = false)
    private Gender gender;
    @Column(nullable = false, name = "phone_number")
    private String phoneNumber;
    @Column(name = "date_of_birth", nullable = false)
    private Date dateOfBirth;
    private String address;
    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Appointment> appointments;

}



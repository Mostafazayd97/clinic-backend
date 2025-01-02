package com.mostafa.Clinic.entity.dto;

import com.mostafa.Clinic.entity.enums.Gender;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class PatientDTO {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Gender gender;
    private Date dateOfBirth;
    private String address;
    private List<Long> appointmentsId;
}

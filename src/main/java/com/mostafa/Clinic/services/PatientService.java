package com.mostafa.Clinic.services;

import com.mostafa.Clinic.entity.Patient;
import com.mostafa.Clinic.entity.dto.PatientDTO;
import com.mostafa.Clinic.repo.PatientRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public  interface PatientService {

    public Patient addPatient(PatientDTO patientDTO);
}

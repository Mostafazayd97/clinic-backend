package com.mostafa.Clinic.controller;

import com.mostafa.Clinic.entity.Patient;
import com.mostafa.Clinic.entity.dto.PatientDTO;
import com.mostafa.Clinic.services.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientController {

    private final PatientService patientService;

    public PatientController(final PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping("/add")
    public ResponseEntity<Patient> addPatient(@RequestBody PatientDTO patientDTO) {
       Patient patient = new Patient();
        try {
         patient =  patientService.addPatient(patientDTO);

       }catch (Exception e) {
           System.out.println(e.getMessage());
           return ResponseEntity.badRequest().build();

       }

        return ResponseEntity.ok(patient);
    }
}

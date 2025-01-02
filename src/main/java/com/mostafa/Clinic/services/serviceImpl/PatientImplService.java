package com.mostafa.Clinic.services.serviceImpl;

import com.mostafa.Clinic.entity.Patient;
import com.mostafa.Clinic.entity.dto.PatientDTO;
import com.mostafa.Clinic.repo.AppointmentRepo;
import com.mostafa.Clinic.repo.PatientRepo;
import com.mostafa.Clinic.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class PatientImplService implements PatientService {

    @Autowired
    private final PatientRepo patientRepo;
    @Autowired
    private final AppointmentRepo appointmentRepo;

    public PatientImplService(PatientRepo patientRepo, AppointmentRepo appointmentRepo) {
        this.patientRepo = patientRepo;
        this.appointmentRepo = appointmentRepo;
    }


    @Override
    public Patient addPatient(PatientDTO patientDTO) {

        Patient newPatient = new Patient();
        newPatient.setFirstName(patientDTO.getFirstName());
        newPatient.setLastName(patientDTO.getLastName());
        newPatient.setGender(patientDTO.getGender());
        newPatient.setPhoneNumber(patientDTO.getPhoneNumber());
        newPatient.setDateOfBirth(patientDTO.getDateOfBirth());
        newPatient.setAddress(patientDTO.getAddress());
        if ( patientDTO.getAppointmentsId() == null || patientDTO.getAppointmentsId().isEmpty() ) {
            newPatient.setAppointments(Collections.emptyList());
        }else {
            List<Long> appointmentsId = patientDTO.getAppointmentsId();
            newPatient.setAppointments(appointmentRepo.findAllById(appointmentsId));
        }

        return patientRepo.save(newPatient);
    }
}

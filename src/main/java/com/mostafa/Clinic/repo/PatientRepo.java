package com.mostafa.Clinic.repo;

import com.mostafa.Clinic.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient,Long> {
}

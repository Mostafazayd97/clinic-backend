package com.mostafa.Clinic.repo;

import com.mostafa.Clinic.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<Doctor,Long> {
}

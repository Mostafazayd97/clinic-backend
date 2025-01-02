package com.mostafa.Clinic.repo;

import com.mostafa.Clinic.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepo extends JpaRepository<Appointment, Long> {
}

package com.project.HospitalManagementSystem.HospitalManagementSystem.Repository;

import com.project.HospitalManagementSystem.HospitalManagementSystem.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long> {
}
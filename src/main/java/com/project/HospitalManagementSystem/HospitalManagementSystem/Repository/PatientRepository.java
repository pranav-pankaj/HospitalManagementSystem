package com.project.HospitalManagementSystem.HospitalManagementSystem.Repository;

import com.project.HospitalManagementSystem.HospitalManagementSystem.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
package com.project.HospitalManagementSystem.HospitalManagementSystem.Repository;

import com.project.HospitalManagementSystem.HospitalManagementSystem.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
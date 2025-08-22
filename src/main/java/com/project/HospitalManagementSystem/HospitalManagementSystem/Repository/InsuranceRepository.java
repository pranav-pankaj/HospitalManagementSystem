package com.project.HospitalManagementSystem.HospitalManagementSystem.Repository;

import com.project.HospitalManagementSystem.HospitalManagementSystem.Entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}
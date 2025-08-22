package com.project.HospitalManagementSystem.HospitalManagementSystem.Dto;

import com.project.HospitalManagementSystem.HospitalManagementSystem.Entity.Patient;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class InsuranceRequestDTO {
    private String policyNbr;
    private String insuranceProvider;
}

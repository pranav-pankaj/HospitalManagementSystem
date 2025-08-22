package com.project.HospitalManagementSystem.HospitalManagementSystem.Dto;

import com.project.HospitalManagementSystem.HospitalManagementSystem.Entity.Patient;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class InsuranceResponseDTO {

    private Long id;
    private String policyNbr;
    private String insuranceProvider;
    private LocalDateTime validUntill;
    private Patient patient;
}

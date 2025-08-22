package com.project.HospitalManagementSystem.HospitalManagementSystem.Dto;

import com.project.HospitalManagementSystem.HospitalManagementSystem.Entity.Enums.BloodGroup;
import com.project.HospitalManagementSystem.HospitalManagementSystem.Entity.Enums.Gender;
import lombok.Data;

import java.time.LocalDate;
@Data
public class PatientRequestDto {
    private String name;
    private Gender gender;
    private String email;
    private LocalDate birthDate;
    private BloodGroup bloodGroup;
}

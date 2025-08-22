package com.project.HospitalManagementSystem.HospitalManagementSystem.Dto;

import com.project.HospitalManagementSystem.HospitalManagementSystem.Entity.Enums.BloodGroup;
import com.project.HospitalManagementSystem.HospitalManagementSystem.Entity.Enums.Gender;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
public class PatientResponseDto {

    private Long id;
    private String name;
    private Gender gender;
    private String email;
    private LocalDate birthDate;
    private BloodGroup bloodGroup;
    private LocalDateTime createdAt;
}

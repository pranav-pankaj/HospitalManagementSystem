package com.project.HospitalManagementSystem.HospitalManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 50,nullable = false)
    private String doctorName;
    @Column(nullable = false)
    private String specialization;
    @Column(nullable = false,unique = true)
    private String email;
    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointmentList;
}

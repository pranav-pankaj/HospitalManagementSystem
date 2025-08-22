package com.project.HospitalManagementSystem.HospitalManagementSystem.Entity;

import com.project.HospitalManagementSystem.HospitalManagementSystem.Entity.Enums.BloodGroup;
import com.project.HospitalManagementSystem.HospitalManagementSystem.Entity.Enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 50,nullable = false)
    private String name;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(nullable = false,unique = true)
    private String email;
    private LocalDate birthDate;
    @Enumerated(EnumType.STRING)
    private BloodGroup bloodGroup;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @OneToOne(cascade = {CascadeType.ALL},orphanRemoval = true)
    @JoinColumn(name = "patient_insurance_id")//owning side
    private Insurance insurance;
    @OneToMany(mappedBy = "patient",cascade={CascadeType.REMOVE},orphanRemoval = true)
    private List<Appointment> appointments;
}

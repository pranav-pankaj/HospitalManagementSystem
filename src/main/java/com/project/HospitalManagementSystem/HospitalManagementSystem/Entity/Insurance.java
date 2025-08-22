package com.project.HospitalManagementSystem.HospitalManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true,nullable = false,length = 20)
    private String policyNbr;
    @Column(nullable = false,length = 100)
    private String insuranceProvider;
    @Column(nullable = false)
    private LocalDateTime validUntill;
    private LocalDateTime createdAt;
    @OneToOne(mappedBy = "insurance")
    private Patient patient;
}

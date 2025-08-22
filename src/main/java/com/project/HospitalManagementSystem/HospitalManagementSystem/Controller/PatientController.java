package com.project.HospitalManagementSystem.HospitalManagementSystem.Controller;

import com.project.HospitalManagementSystem.HospitalManagementSystem.Dto.PatientRequestDto;
import com.project.HospitalManagementSystem.HospitalManagementSystem.Dto.PatientResponseDto;
import com.project.HospitalManagementSystem.HospitalManagementSystem.Service.PatientService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/hospital")
@RestController
public class PatientController {
    @Autowired
    private PatientService patientService;
    @PostMapping("/createPatient")
    public ResponseEntity<PatientResponseDto> createNewPatient(@RequestBody PatientRequestDto patientRequestDto){
        PatientResponseDto newPatient = patientService.createNewPatient(patientRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(newPatient);
    }
    @DeleteMapping("/deletePatient/{id}")
    public ResponseEntity<PatientResponseDto> deletePatientById(@PathVariable Long id){
        PatientResponseDto patientResponseDto = patientService.deletePatientById(id);
        return ResponseEntity.ok(patientResponseDto);
    }
    @PutMapping("/updatepatient/{id}")
    public ResponseEntity<PatientResponseDto> updatePatientById(@PathVariable Long id,@RequestBody PatientRequestDto patientRequestDto){
        PatientResponseDto patientResponseDto = patientService.updatePatient(id,patientRequestDto);
        return ResponseEntity.status(HttpStatus.OK).body(patientResponseDto);
    }
}

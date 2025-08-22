package com.project.HospitalManagementSystem.HospitalManagementSystem.Service;

import com.project.HospitalManagementSystem.HospitalManagementSystem.Dto.PatientRequestDto;
import com.project.HospitalManagementSystem.HospitalManagementSystem.Dto.PatientResponseDto;
import com.project.HospitalManagementSystem.HospitalManagementSystem.Entity.Patient;
import com.project.HospitalManagementSystem.HospitalManagementSystem.Repository.PatientRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private  ModelMapper modelMapper;

    public PatientResponseDto createNewPatient(PatientRequestDto patientRequestDto){
        Patient patient = modelMapper.map(patientRequestDto, Patient.class);
        Patient savePatient = patientRepository.save(patient);
        PatientResponseDto patientResponseDto = modelMapper.map(savePatient, PatientResponseDto.class);
        return patientResponseDto;
    }

    public PatientResponseDto deletePatientById(Long patientId){
        Patient patient = patientRepository.findById(patientId).orElseThrow(() -> new EntityNotFoundException("Patient with given ID not found"));
        PatientResponseDto patientResponseDto = modelMapper.map(patient, PatientResponseDto.class);
        patientRepository.delete(patient);
        return patientResponseDto;
    }
    public PatientResponseDto updatePatient(Long patientId,PatientRequestDto dto){
        Patient patient = patientRepository.findById(patientId).orElseThrow(() -> new EntityNotFoundException("Patient with given Id not Found"));
        modelMapper.map(dto, patient);
        Patient save = patientRepository.save(patient);
        return modelMapper.map(save, PatientResponseDto.class);
    }
}

package com.xworkz.bloodbank.service;

import com.xworkz.bloodbank.Dto.PatientDto;

public interface PatientService {

    boolean savePatient(PatientDto patient);
    void getPatient();
}

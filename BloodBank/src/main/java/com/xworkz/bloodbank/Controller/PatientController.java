package com.xworkz.bloodbank.Controller;

import com.xworkz.bloodbank.Dto.PatientDto;
import com.xworkz.bloodbank.service.PatientService;
import com.xworkz.bloodbank.service.impl.PatientServiceImpl;

public class PatientController {

    PatientService patientService = new PatientServiceImpl();
    public boolean savePatient(PatientDto patient){
        return patientService.savePatient(patient);
    }
    public void getPatient(){
        patientService.getPatient();

    }
}

package com.xworkz.bloodbank.runner;

import com.xworkz.bloodbank.Controller.PatientController;
import com.xworkz.bloodbank.Dao.PatientDao;
import com.xworkz.bloodbank.Dto.PatientDto;
import com.xworkz.bloodbank.constants.BloodGroup;
import com.xworkz.bloodbank.constants.Gender;

public class PatientRunner {

    public static void main(String[] args) {

        PatientController patientController = new PatientController();
        PatientDto patientDto = new PatientDto();
        patientDto.setId(1);
        patientDto.setPatientName("Ganesh");
        patientDto.setGender(Gender.MALE);
        patientDto.setBloodGroup(BloodGroup.AB_POSITIVE);
        patientDto.setHospitalName("Narayan Hospital");
        patientDto.setAddress("Manglore");

        patientController.savePatient(patientDto);
        patientController.getPatient();

    }
}

package com.xworkz.bloodbank.service.impl;

import com.xworkz.bloodbank.Dao.PatientDao;
import com.xworkz.bloodbank.Dao.impl.PatientDaoImpl;
import com.xworkz.bloodbank.Dto.PatientDto;
import com.xworkz.bloodbank.entity.PatientEntity;
import com.xworkz.bloodbank.service.PatientService;

public class PatientServiceImpl implements PatientService {

    PatientDao patientDao = new PatientDaoImpl();
    @Override
    public boolean savePatient(PatientDto patient) {
        PatientEntity patientEntity = new PatientEntity();
        patientEntity.setId(patient.getId());
        patientEntity.setPatientName(patient.getPatientName());
        patientEntity.setGender(patient.getGender());
        patientEntity.setBloodGroup(patient.getBloodGroup());
        patientEntity.setHospitalName(patient.getHospitalName());
        patientEntity.setAddress(patient.getAddress());
        return patientDao.savePatient(patientEntity);
    }

    @Override
    public void getPatient() {
        patientDao.getPatient();

    }
}

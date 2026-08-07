package com.xworkz.bloodbank.Dao.impl;

import com.xworkz.bloodbank.Dao.PatientDao;
import com.xworkz.bloodbank.entity.PatientEntity;

import java.util.ArrayList;
import java.util.List;

public class PatientDaoImpl implements PatientDao {

    List<PatientEntity> patientEntities = new ArrayList<>();
    @Override
    public boolean savePatient(PatientEntity patient) {

        return patientEntities.add(patient);
    }

    @Override
    public void getPatient() {
            for(PatientEntity patient:patientEntities){
                System.out.println(patient);
            }
    }
}

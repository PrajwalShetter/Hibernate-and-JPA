package com.xworkz.bloodbank.Dao;

import com.xworkz.bloodbank.entity.PatientEntity;

public interface PatientDao {

    boolean savePatient(PatientEntity patient);
    void getPatient();
}

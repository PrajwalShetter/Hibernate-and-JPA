package com.xworkz.bloodbank.service.impl;

import com.xworkz.bloodbank.Dao.BloodRequestDao;
import com.xworkz.bloodbank.Dao.impl.BloodRequestDaoImpl;
import com.xworkz.bloodbank.Dto.BloodRequestDto;
import com.xworkz.bloodbank.entity.BloodBankEntity;
import com.xworkz.bloodbank.entity.BloodRequestEntity;
import com.xworkz.bloodbank.entity.PatientEntity;
import com.xworkz.bloodbank.service.BloodRequestService;

public class BloodRequestServiceImpl implements BloodRequestService {

    BloodRequestDao bloodRequestDao = new BloodRequestDaoImpl();
    @Override
    public boolean saveRequest(BloodRequestDto requestEntity) {
        BloodRequestEntity bloodEntity = new BloodRequestEntity();
        bloodEntity.setRequestId(requestEntity.getRequestId());

        PatientEntity patient = new PatientEntity();
        patient.setId(requestEntity.getPatientId());
        bloodEntity.setPatient(patient);

        BloodBankEntity bloodBank = new BloodBankEntity();
        bloodBank.setId(requestEntity.getBankId());
        bloodEntity.setBank(bloodBank);

        bloodEntity.setBloodGroup(requestEntity.getBloodGroup());
        bloodEntity.setUnits(requestEntity.getUnits());
        bloodEntity.setRequestDate(requestEntity.getRequestDate());
        bloodEntity.setStatus(requestEntity.getStatus());


        return bloodRequestDao.saveRequest(bloodEntity);
    }

    @Override
    public void getRequest() {
        bloodRequestDao.getRequest();
    }
}

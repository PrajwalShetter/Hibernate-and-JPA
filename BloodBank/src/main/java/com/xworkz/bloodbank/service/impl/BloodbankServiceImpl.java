package com.xworkz.bloodbank.service.impl;

import com.xworkz.bloodbank.Dao.BloodBankDao;
import com.xworkz.bloodbank.Dao.impl.BloodBankDaoImpl;
import com.xworkz.bloodbank.Dto.BloodBankDto;
import com.xworkz.bloodbank.entity.BloodBankEntity;
import com.xworkz.bloodbank.service.BloodbankService;

public class BloodbankServiceImpl implements BloodbankService {

    BloodBankDao bloodBankDao = new BloodBankDaoImpl();

    @Override
    public boolean saveBloodBank(BloodBankDto bloodBank) {
        BloodBankEntity bloodBankEntity= new BloodBankEntity();
        bloodBankEntity.setId(bloodBank.getId());
        bloodBankEntity.setName(bloodBank.getName());
        bloodBankEntity.setPhone(bloodBank.getPhone());
        bloodBankEntity.setAddress(bloodBank.getAddress());


        return bloodBankDao.saveBloodBank(bloodBankEntity);
    }

    @Override
    public void getBloodbank() {
        bloodBankDao.getBloodbank();
    }

    @Override
    public BloodBankEntity getById(int id) {
        return bloodBankDao.getById(id);
    }
}

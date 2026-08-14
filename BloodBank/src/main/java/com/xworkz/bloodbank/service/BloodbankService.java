package com.xworkz.bloodbank.service;

import com.xworkz.bloodbank.Dto.BloodBankDto;
import com.xworkz.bloodbank.entity.BloodBankEntity;

public interface BloodbankService {

    boolean saveBloodBank(BloodBankDto bloodBank);
    void getBloodbank();
    BloodBankEntity getById(int id);
}

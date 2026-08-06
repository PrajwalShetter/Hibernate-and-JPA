package com.xworkz.bloodbank.Controller;

import com.xworkz.bloodbank.Dto.BloodBankDto;
import com.xworkz.bloodbank.service.BloodbankService;
import com.xworkz.bloodbank.service.impl.BloodbankServiceImpl;

public class BloodBankController {

    BloodbankService bloodbankService= new BloodbankServiceImpl();

    public boolean saveBloodBank(BloodBankDto bloodBank){
        return bloodbankService.saveBloodBank(bloodBank);

    }

    public  void getBloodBank(){
        bloodbankService.getBloodbank();
    }
}

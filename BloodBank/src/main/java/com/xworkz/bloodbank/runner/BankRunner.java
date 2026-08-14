package com.xworkz.bloodbank.runner;

import com.xworkz.bloodbank.Controller.BloodBankController;
import com.xworkz.bloodbank.Dto.BloodBankDto;
import com.xworkz.bloodbank.entity.BloodBankEntity;

public class BankRunner {

    public static void main(String[] args) {

        BloodBankController bankController = new BloodBankController();
        BloodBankDto bankDto = new BloodBankDto();
        bankDto.setId(0);
        bankDto.setName("Sanjivini Blood bank");
        bankDto.setPhone(8899776655L);
        bankDto.setAddress("Beng");

//        bankController.saveBloodBank(bankDto);
        bankController.getBloodBank();
        BloodBankEntity bloodBank =bankController.getById(2);
        System.out.println(bloodBank);

    }
}

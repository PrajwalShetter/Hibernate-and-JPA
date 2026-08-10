package com.xworkz.bloodbank.runner;

import com.xworkz.bloodbank.Controller.BloodBankController;
import com.xworkz.bloodbank.Dto.BloodBankDto;

public class BankRunner {

    public static void main(String[] args) {

        BloodBankController bankController = new BloodBankController();
        BloodBankDto bankDto = new BloodBankDto();
        bankDto.setId(1);
        bankDto.setName("Life Blood bank");
        bankDto.setPhone(9900887799L);
        bankDto.setAddress("Beng");

        bankController.saveBloodBank(bankDto);
        bankController.getBloodBank();

    }
}

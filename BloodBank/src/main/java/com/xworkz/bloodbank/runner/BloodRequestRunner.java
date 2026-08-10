package com.xworkz.bloodbank.runner;

import com.xworkz.bloodbank.Controller.BloodBankController;
import com.xworkz.bloodbank.Controller.BloodRequestController;
import com.xworkz.bloodbank.Dto.BloodRequestDto;
import com.xworkz.bloodbank.constants.BloodGroup;

public class BloodRequestRunner {
    public static void main(String[] args) {

        BloodRequestController bloodRequestController = new BloodRequestController();
        BloodRequestDto bloodRequestDto = new BloodRequestDto();
        bloodRequestDto.setRequestId(1);
        bloodRequestDto.setPatientId(1);
        bloodRequestDto.setBankId(1);
        bloodRequestDto.setBloodGroup(BloodGroup.A_NEGATIVE);
        bloodRequestDto.setUnits(3);
        bloodRequestDto.setRequestDate(java.sql.Date.valueOf("2026-08-28"));
        bloodRequestDto.setStatus("approved");

        bloodRequestController.saveRequest(bloodRequestDto);
        bloodRequestController.getRequest();

    }
}

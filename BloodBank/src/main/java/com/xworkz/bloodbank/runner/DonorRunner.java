package com.xworkz.bloodbank.runner;

import com.xworkz.bloodbank.Controller.DonorController;
import com.xworkz.bloodbank.Dto.DonorDto;
import com.xworkz.bloodbank.constants.BloodGroup;
import com.xworkz.bloodbank.constants.Gender;

public class DonorRunner {

    public static void main(String[] args) {

        DonorController controller = new DonorController();
        DonorDto dto = new DonorDto();
        dto.setId(1);
        dto.setAge(20);
        dto.setName("Ravi");
        dto.setGender(Gender.MALE);
        dto.setPhone(8899007890L);
        dto.setBloodGroup(BloodGroup.A_POSITIVE);
        dto.setAddress("Beng");

        controller.saveDonor(dto);
        controller.getDonors();



    }
}

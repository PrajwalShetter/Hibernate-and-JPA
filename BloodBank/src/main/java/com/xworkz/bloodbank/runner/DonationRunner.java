package com.xworkz.bloodbank.runner;

import com.xworkz.bloodbank.Controller.DonationController;
import com.xworkz.bloodbank.Dto.DonationDto;

public class DonationRunner {
    public static void main(String[] args) {


        DonationDto donationDto = new DonationDto();
        donationDto.setId(1);
        donationDto.setDonorId(1);
        donationDto.setBloodBankId(1);
        donationDto.setDonationDate(java.sql.Date.valueOf("2026-08-06"));
        donationDto.setQuantityMl(250);

        DonationController  donationController = new DonationController();
        donationController.saveDonation(donationDto);
        donationController.getDonation();


    }
}

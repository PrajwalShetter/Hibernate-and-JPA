package com.xworkz.bloodbank.Controller;

import com.xworkz.bloodbank.Dto.DonationDto;
import com.xworkz.bloodbank.entity.DonationEntity;
import com.xworkz.bloodbank.service.DonationService;
import com.xworkz.bloodbank.service.impl.DonationServiceImpl;

public class DonationController {

    DonationService donationService = new DonationServiceImpl();

    public boolean saveDonation(DonationDto donation){
        return donationService.saveDonation(donation);
    }
    public void getDonation(){
        donationService.getDonation();
    }
}

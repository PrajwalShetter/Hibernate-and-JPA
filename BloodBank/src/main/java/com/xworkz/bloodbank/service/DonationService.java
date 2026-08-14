package com.xworkz.bloodbank.service;

import com.xworkz.bloodbank.Dto.DonationDto;
import com.xworkz.bloodbank.entity.DonationEntity;

public interface DonationService {

    boolean saveDonation(DonationDto donation);
    void getDonation();
}

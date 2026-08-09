package com.xworkz.bloodbank.Dao;

import com.xworkz.bloodbank.entity.DonationEntity;

public interface DonationDao {

    boolean saveDonation(DonationEntity donation);
    void getDonation();
}

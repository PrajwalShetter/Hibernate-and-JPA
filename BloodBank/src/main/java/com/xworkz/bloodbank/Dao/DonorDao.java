package com.xworkz.bloodbank.Dao;

import com.xworkz.bloodbank.entity.DonorEntity;

public interface DonorDao {

    boolean saveDonor(DonorEntity donor);
    void getDonors();
}

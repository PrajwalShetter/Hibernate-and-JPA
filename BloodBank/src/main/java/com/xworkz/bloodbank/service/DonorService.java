package com.xworkz.bloodbank.service;

import com.xworkz.bloodbank.Dto.DonorDto;
import com.xworkz.bloodbank.entity.DonorEntity;

public interface DonorService {

    boolean saveDonor(DonorDto donor);
    void getDonors();
}

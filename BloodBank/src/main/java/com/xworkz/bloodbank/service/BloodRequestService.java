package com.xworkz.bloodbank.service;

import com.xworkz.bloodbank.Dto.BloodRequestDto;
import com.xworkz.bloodbank.entity.BloodRequestEntity;

public interface BloodRequestService {

    boolean saveRequest(BloodRequestDto requestEntity);
    void getRequest();
}

package com.xworkz.bloodbank.Controller;

import com.xworkz.bloodbank.Dto.BloodRequestDto;
import com.xworkz.bloodbank.entity.BloodRequestEntity;
import com.xworkz.bloodbank.service.BloodRequestService;
import com.xworkz.bloodbank.service.impl.BloodRequestServiceImpl;

public class BloodRequestController {

    BloodRequestService bloodRequestService= new BloodRequestServiceImpl();
    public boolean saveRequest(BloodRequestDto request){
        return bloodRequestService.saveRequest(request);
    }

    public void getRequest(){
        bloodRequestService.getRequest();
    }
}

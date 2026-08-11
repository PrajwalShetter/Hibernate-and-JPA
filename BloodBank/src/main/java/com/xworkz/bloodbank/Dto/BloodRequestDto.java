package com.xworkz.bloodbank.Dto;

import com.xworkz.bloodbank.constants.BloodGroup;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BloodRequestDto {

    private int requestId;
    private int patientId;
    private int bankId;
    private BloodGroup bloodGroup;
    private int units;
    private Date requestDate;
    private String status;
}

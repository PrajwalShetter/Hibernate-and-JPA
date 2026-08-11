package com.xworkz.bloodbank.Dto;

import com.xworkz.bloodbank.constants.BloodGroup;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BloodStockDto {

    private int stockId;
    private int bankId;
    private BloodGroup bloodGroup;
    private int availableUnits;
    private Date lastUpdate;


}

package com.xworkz.dominoz.dto;

import com.xworkz.dominoz.constants.Category;
import com.xworkz.dominoz.constants.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PizzaDto {

    private int id;
    private String name;
    private Size size;
    private Category category;
    private double price;

}

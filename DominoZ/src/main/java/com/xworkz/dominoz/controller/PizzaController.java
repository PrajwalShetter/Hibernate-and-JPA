package com.xworkz.dominoz.controller;

import com.xworkz.dominoz.dto.PizzaDto;
import com.xworkz.dominoz.service.PizzaService;
import com.xworkz.dominoz.service.impl.pizzaServiceImpl;

public class PizzaController {

    PizzaService pizzaService = new pizzaServiceImpl();

    public boolean savePizza(PizzaDto pizzaDto){
        return pizzaService.savePizza(pizzaDto);
    }

    public  PizzaDto getPizza(int id){
        return pizzaService.getPizza(id);
    }

    public  boolean updatePriceById(int id, double price){
        return pizzaService.updatePrizeBYId(id, price);
    }

    public  boolean deletePizzaById(int id){
        return pizzaService.deletePizzaById(id);
    }


}

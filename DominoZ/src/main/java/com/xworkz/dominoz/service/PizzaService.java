package com.xworkz.dominoz.service;

import com.xworkz.dominoz.dto.PizzaDto;
import com.xworkz.dominoz.entity.PizzaEntity;

public interface PizzaService {

    boolean savePizza(PizzaDto pizzaDto);
    void getPizza();
    PizzaDto getPizza(int id);
    boolean updatePrizeBYId(int id, double prize);
    boolean deletePizzaById(int id);

}

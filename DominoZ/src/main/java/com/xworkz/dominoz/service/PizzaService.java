package com.xworkz.dominoz.service;

import com.xworkz.dominoz.dto.PizzaDto;
import com.xworkz.dominoz.entity.PizzaEntity;

import java.util.List;

public interface PizzaService {

    boolean savePizza(PizzaDto pizzaDto);
    void getPizza();
    PizzaDto getPizza(int id);
    boolean updatePrizeBYId(int id, double prize);
    boolean deletePizzaById(int id);
    List<PizzaDto> getAllPizza();
    List<String> getPizzaNames();
    PizzaDto getPizzaDataByName(String pizzaName);
    List<PizzaDto> getPizzaByPrize(double prize);

}

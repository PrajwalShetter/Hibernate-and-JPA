package com.xworkz.dominoz.dao;

import com.xworkz.dominoz.entity.PizzaEntity;

import java.util.List;

public interface PizzaDao {

    boolean savePizza(PizzaEntity pizzaEntity);
   PizzaEntity getPizza(int id);
   boolean updatePrizeById(int id, double prize);
   boolean deletePizzaById(int id);
   List<PizzaEntity> getAllPizza();
}

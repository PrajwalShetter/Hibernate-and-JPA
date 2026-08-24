package com.xworkz.dominoz.service.impl;

import com.xworkz.dominoz.dao.PizzaDao;
import com.xworkz.dominoz.dao.impl.PizzaDaoImpl;
import com.xworkz.dominoz.dto.PizzaDto;
import com.xworkz.dominoz.entity.PizzaEntity;
import com.xworkz.dominoz.service.PizzaService;

public class pizzaServiceImpl implements PizzaService {


    @Override
    public boolean savePizza(PizzaDto pizzaDto) {
        PizzaDao pizzaDao = new PizzaDaoImpl();
        PizzaEntity pizzaEntity = new PizzaEntity();
        pizzaEntity.setId(pizzaDto.getId());
        pizzaEntity.setName(pizzaDto.getName());
        pizzaEntity.setCategory(pizzaDto.getCategory());
        pizzaEntity.setSize(pizzaDto.getSize());
        pizzaEntity.setPrice(pizzaDto.getPrice());

        return pizzaDao.savePizza(pizzaEntity);
    }

    @Override
    public void getPizza() {

    }

    @Override
    public PizzaDto getPizza(int id) {

        PizzaDao pizzaDao = new PizzaDaoImpl();
        PizzaDto pizzaDto = new PizzaDto();
        PizzaEntity pizzaEntity = pizzaDao.getPizza(id);
        if(pizzaEntity != null){
            pizzaDto.setSize(pizzaEntity.getSize());
            pizzaDto.setName(pizzaEntity.getName());
            pizzaDto.setPrice(pizzaEntity.getPrice());
            pizzaDto.setId(pizzaEntity.getId());
            pizzaDto.setCategory(pizzaEntity.getCategory());

        }
        return pizzaDto;
    }

    @Override
    public boolean updatePrizeBYId(int id, double prize) {

        PizzaDao pizzaDao = new PizzaDaoImpl();
        return pizzaDao.updatePrizeById(id,prize);
    }

    @Override
    public boolean deletePizzaById(int id) {
        PizzaDao pizzaDao = new PizzaDaoImpl();
        return pizzaDao.deletePizzaById(id) ;
    }
}

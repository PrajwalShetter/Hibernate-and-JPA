package com.xworkz.dominoz.service.impl;

import com.xworkz.dominoz.dao.PizzaDao;
import com.xworkz.dominoz.dao.impl.PizzaDaoImpl;
import com.xworkz.dominoz.dto.PizzaDto;
import com.xworkz.dominoz.entity.PizzaEntity;
import com.xworkz.dominoz.service.PizzaService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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


    @Override
    public List<PizzaDto> getAllPizza() {
        PizzaDao pizzaDao = new PizzaDaoImpl();
        List<PizzaDto> pizzaDtos = new ArrayList<>();
        List<PizzaEntity> pizzaEntities = pizzaDao.getAllPizza();

        if(pizzaEntities != null){

            pizzaEntities.forEach(pizzaEntity -> {
                PizzaDto pizza = new PizzaDto();
                pizza.setId(pizzaEntity.getId());
                pizza.setCategory(pizzaEntity.getCategory());
                pizza.setSize(pizzaEntity.getSize());
                pizza.setName(pizzaEntity.getName());
                pizza.setPrice(pizzaEntity.getPrice());
                pizzaDtos.add(pizza);
            });
        }
        return pizzaDtos;
    }

    @Override
    public List<String> getPizzaNames() {
        PizzaDao pizzaDao = new PizzaDaoImpl();
        List<String> names = pizzaDao.getPizzaNames();
        return names;
    }

    @Override
    public PizzaDto getPizzaDataByName(String pizzaName) {

        PizzaDao pizzaDao = new PizzaDaoImpl();
        PizzaEntity pizzaEntity = pizzaDao.getPizzaDataByName(pizzaName);
        PizzaDto pizzaDto = new PizzaDto();

        if(pizzaEntity != null){
            pizzaDto.setName(pizzaEntity.getName());
            pizzaDto.setSize(pizzaEntity.getSize());
            pizzaDto.setPrice(pizzaEntity.getPrice());
            pizzaDto.setId(pizzaEntity.getId());
            pizzaDto.setCategory(pizzaEntity.getCategory());

        }

        return pizzaDto;
    }

    @Override
    public List<PizzaDto> getPizzaByPrize(double prize) {

        PizzaDao pizzaDao = new PizzaDaoImpl();
        List<PizzaDto> pizzaDtos = new ArrayList<>();
        List<PizzaEntity> pizzaEntity = pizzaDao.getPizzaByPrize(prize);

        if(pizzaEntity != null){

            pizzaEntity.forEach(pizzaEntity1 -> {
                PizzaDto pizzaDto = new PizzaDto();
                pizzaDto.setCategory(pizzaEntity1.getCategory());
                pizzaDto.setName(pizzaEntity1.getName());
                pizzaDto.setId(pizzaEntity1.getId());
                pizzaDto.setPrice(pizzaEntity1.getPrice());
                pizzaDto.setSize(pizzaEntity1.getSize());
                pizzaDtos.add(pizzaDto);
            });
        }
        return pizzaDtos;
    }
}

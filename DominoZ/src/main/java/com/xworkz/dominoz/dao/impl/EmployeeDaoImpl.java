package com.xworkz.dominoz.dao.impl;

import com.xworkz.dominoz.dao.EmployeeDao;
import com.xworkz.dominoz.entity.EmployeeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Collections;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public  EmployeeDaoImpl(){
        entityManagerFactory = Persistence.createEntityManagerFactory("dominoz");
        entityManager = entityManagerFactory.createEntityManager();

    }
    @Override
    public boolean saveEmployee(EmployeeEntity employeeEntity) {
        entityManager.getTransaction().begin();
        entityManager.persist(employeeEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManager.close();
        return true;
    }

    @Override
    public List<EmployeeEntity> getEmployees() {
        String jpql= "select e from EmployeeEntity e";
        List<EmployeeEntity> employeeEntities= entityManager.createQuery(jpql).getResultList();
        entityManager.close();
        entityManager.close();
        return employeeEntities;
    }

    @Override
    public EmployeeEntity getEmployeeByPhone(long phone) {
        EmployeeEntity employeeEntities = (EmployeeEntity) entityManager.createQuery("select e from EmplyeeEntity e where e.phone = phone").getSingleResult();
        entityManager.close();
        entityManagerFactory.close();
        return employeeEntities;
    }

    @Override
    public List<EmployeeEntity> getEmployeeByAge(int age) {
        List<EmployeeEntity> employeeEntities = entityManager.createQuery("select e from EmployeeEntity e where e.age=age").getResultList();
        entityManager.close();
        entityManagerFactory.close();
        return employeeEntities;
    }
}

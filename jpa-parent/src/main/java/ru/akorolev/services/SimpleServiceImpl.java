package ru.akorolev.services;

import org.springframework.stereotype.Repository;
import ru.akorolev.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by akorolev on 5/10/14.
 */
@Repository(value = "repo")
public class SimpleServiceImpl {
    @PersistenceContext(unitName = "entityManager")
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void printValue() {
        System.out.println(entityManager.find(Person.class, new Integer(1)));
    }
}

package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
    public static void main(String[] args) {
        Employee e = new Employee();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        e.setEid(1);
        e.setName("Dinesh");
        e.setSal(33000);

        et.begin();
        em.persist(e);
        et.commit();


    }
}

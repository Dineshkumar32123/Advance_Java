package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Employee e = new Employee();
//        e.setName("Dinesh");
//        e.setEid(1);
//        e.setSal(50000);

        e.setName("Bharani");
        e.setSal(60000);
        e.setEid(3);


//        et.begin();
//        em.merge(e);
//        et.commit();

        et.begin();
        em.merge(e);
        et.commit();
    }
}

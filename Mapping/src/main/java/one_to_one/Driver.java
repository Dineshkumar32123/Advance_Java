package one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

//Creating object for panCard class
        PanCard p = new PanCard();
        p.setAddress("Chennai");
        p.setPhone(9944387074L);
        p.setDOB("01.01.2000");
        p.setPno(54321);

// Creating object for Person class
        Person p1 = new Person();
        p1.setAge(22);
        p1.setId(321);
        p1.setGender("Male");
        p1.setName("DINESH");
        p1.setP(p);

        try{
            et.begin();
            em.persist(p1);
            em.persist(p);
            et.commit();
        }catch(Exception e){
            et.rollback();
        }
    }
}

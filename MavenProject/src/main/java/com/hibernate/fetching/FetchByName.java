package fetching;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.Person;

public class FetchByName {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select p from Person p where p.name='Virat'");
		
//		Object o = q.getSingleResult();
//		
//		Person p = (Person) o;
		
		Person p = (Person) q.getSingleResult();
		
		System.out.println(p);
	}
}

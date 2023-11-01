package fetching;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.Person;
public class FetchNames {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select p.name from Person p");
		
		List<String> names = q.getResultList();
		
		for(String s : names) {
			System.out.println(s);
		}
		
	}
}

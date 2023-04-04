package tessere;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TesseraDAO {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("W3-weeklyProject-java");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		
		List<Tessera> listaTessere = findAllTessere();
		// TODO Auto-generated method stub

	}

	public static List<Tessera> findAllTessere() {
		Query q = em.createNamedQuery("tessere.findAll");
		return q.getResultList();
	}

}

package mezzi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MezziDAO {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("W3-weeklyProject-java");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

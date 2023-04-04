package utenti;

import java.util.List;

import javax.persistence.*;


public class UtentiDAO {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("W3-weeklyProject-java");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		
		List<Utente> listaUtenti = findAllUtenti();
		
		

	}
	
	public static List<Utente> findAllUtenti() {
		Query q = em.createNamedQuery("utenti.findAll");
		return q.getResultList();
	}
	

}

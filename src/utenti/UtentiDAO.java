package utenti;

import java.util.List;

import javax.persistence.*;


public class UtentiDAO {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BW-java1");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		
		List<Utente> listaUtenti = findAllUtenti();
		
		// TODO Auto-generated method stub

	}
	
	public static List<Utente> findAllUtenti() {
		Query q = em.createNamedQuery("utenti.findAll");
		return q.getResultList();
	}
	

}

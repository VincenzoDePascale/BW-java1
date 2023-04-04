package titoli;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.*;

public class TitoliDAO {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("W3-weeklyProject-java");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		
		List<Titolo> listaTitoli = findAllTitoli();
		
		try {
			
			Abbonamento A1 = new Abbonamento();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			em.close();
		}
		

	}
	
	public static List<Titolo> findAllTitoli() {
		Query q = em.createNamedQuery("titoli.findAll");
		return q.getResultList();
	}
	
	public static void addTitolo(Titolo e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println("Nuovo titolo aggiunto!");
	}
	
	public static void dellTitolo(Titolo e) {
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
		System.out.println("Nuovo titolo aggiunto!");
	}
	
	public static Titolo serchByNum(Long id) {
		em.getTransaction().begin();
		
		TypedQuery<Titolo> query = em.createQuery("SELECT t FROM Titolo t WHERE t.id = :id", Titolo.class);
		query.setParameter("id", id);
		Titolo resultp = query.getSingleResult();
		
		em.getTransaction().commit();
	    if (resultp != null) {
	    	System.out.println(resultp.toString());
	    } else {
	        System.out.println("Nessun titolo di viaggio trovato con questo numero " + id);
	    }
	    return resultp;
	}

}

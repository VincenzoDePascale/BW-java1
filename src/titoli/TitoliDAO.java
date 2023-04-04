package titoli;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

public class TitoliDAO {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BW-java1");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		
		List<Titolo> listaTitoli = findAllTitoli();
		
		try {
			
			Abbonamento A1 = new Abbonamento();
			A1.setData_emissione(LocalDate.of(2023, 4, 4));
			A1.setData_inizio(LocalDate.of(2023, 4, 4));
			A1.setDurata(TipoAbbonamento.SETTIMANALE);
			A1.toString();
			
			Biglietto B1 = new Biglietto();
			B1.setData_emissione(LocalDate.of(2023, 4, 4));
			B1.toString();
			
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

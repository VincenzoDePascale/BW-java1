package tratte;

import JPA_util.JpaUtil;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class TratteDAO {
	
	static EntityManager em = JpaUtil.getEmf().createEntityManager();
	
	public static void main(String[] args) {
		
		try {
		Tratta t = new Tratta();
		t.setCapolinea("Roma");
		t.setNome_tratta("Na-Ro");
		t.setPartenza("Napoli");
		
		addTratta(t);
		List<Tratta> listaDelleTratte = findAllTratte();
		System.out.println(listaDelleTratte);
		Tratta letta = findTrattaByID(4l);
		System.out.println(letta);
		
		} catch (Exception e){
			em.getTransaction().rollback();
		} finally {
			em.close();
		}

	}
	
	public static void addTratta(Tratta t) {
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		System.out.println("Tratta aggiunta");
	}
	
	public static List<Tratta> findAllTratte() {
		Query q = em.createNamedQuery("tratte.findAll");
		return q.getResultList();
	}
	
	public static void removeTratta(Tratta t) {
		em.getTransaction().begin();
		em.remove(t);
		em.getTransaction().commit();
		System.out.println("Tratta eliminata");
	}
	
	public static Tratta findTrattaByID(Long id) {
		Query q = em.createNamedQuery("findById");
		q.setParameter("id", id);
		return (Tratta) q.getSingleResult();
	}

}

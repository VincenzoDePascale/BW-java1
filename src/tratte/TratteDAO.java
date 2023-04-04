package tratte;
//
//import java.time.LocalTime;
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//
public class TratteDAO {
//
//	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BW-java1");
//	static EntityManager em = emf.createEntityManager();
//	
//	public static void main(String[] args) {
//		
//		Tratta t = new Tratta();
//		LocalTime L1 = LocalTime.parse("10:00");
//		t.setCapolinea("Roma");
//		t.setDurata_media(L1);
//		t.setNome_tratta("Na-Ro");
//		t.setPartenza("Napoli");
//		
//		//addTratta(t);
//		List<Tratta> listaDelleTratte = findAllTratte();
//		System.out.println(listaDelleTratte);
//
//	}
//	
//	public static void addTratta(Tratta t) {
//		try {
//		em.getTransaction().begin();
//		em.persist(t);
//		em.getTransaction().commit();
//		System.out.println("Aggiunto");
//		} catch (Exception e){
//			em.getTransaction().rollback();
//		} finally {
//			em.close();
//		}
//	}
//	
//	public static List<Tratta> findAllTratte() {
//		Query q = em.createNamedQuery("tratte.findAll");
//		return q.getResultList();
//	}

}

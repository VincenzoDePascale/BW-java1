package utenti;

//import JPA_util.JpaUtil;
//
//import java.util.List;
//
//import javax.persistence.*;
//

public class UtentiDAO {
	
//	static EntityManager em = JpaUtil.getEmf().createEntityManager();
//
//	public static void main(String[] args) {
//		
//		List<Utente> listaUtenti;
//		
//		try {
//			
//			
//			listaUtenti = findAllUtenti();
//		}catch(Exception e){
//			e.printStackTrace();
//		}finally {
//			em.close();
//		}
//		
//
//	}
//	
//	public static List<Utente> findAllUtenti() {
//		Query q = em.createNamedQuery("utenti.findAll");
//		return q.getResultList();
//	}
//	
//	public static void addUtente(Utente u) {
//		em.getTransaction().begin();
//		em.persist(u);
//		em.getTransaction().commit();
//		System.out.println("Nuovo utente salvato!");
//	}
//	
//	public static void dellTitolo(Utente u) {
//		em.getTransaction().begin();
//		em.remove(u);
//		em.getTransaction().commit();
//		System.out.println("utente eliminato!");
//	}
//	
//	
//	

}

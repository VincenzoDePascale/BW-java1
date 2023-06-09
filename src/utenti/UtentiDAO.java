package utenti;

import JPA_util.JpaUtil;
import tessere.Tessera;
import tessere.TesseraDAO;
import titoli.Abbonamento;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;


public class UtentiDAO {
	
	static EntityManager em = JpaUtil.getEmf().createEntityManager();

	public static void main(String[] args) {
		
		List<Utente> listaUtenti;
		
		try {
//			/*utente + tessera già esistente*/
//			Utente U1 = new Utente();
//			U1.setNome("Vincenzo");
//			U1.setCognome("De Pascale");
//			U1.setTessera(TesseraDAO.serchByid(1000l));
//			//addUtente(U1);
//			
//			/*creazione di tessera ed utente*/
//			Utente U2 = new Utente();
//			U2.setNome("pippo");
//			U2.setCognome("De Pascale");
//			Tessera T6 = new Tessera();
//			T6.setData_creazione(LocalDate.of(2023, 4, 5));
//			//TesseraDAO.addTessera(T6);
//			U2.setTessera(T6);
//			//addUtente(U2);
//			
//			System.out.println(findUtenteById(1l));
//						
//			listaUtenti = findAllUtenti();
			

			if (isTesseraOfUtenteValid(findUtenteById(2L))) {
			    System.out.println("tessera is valid");
			} else {
			    System.out.println("tessera is not valid");
			}
			

		}catch(Exception e){
			e.printStackTrace();
		}finally {
			em.close();
		}
		
	}
	
	public static List<Utente> findAllUtenti() {
		Query q = em.createNamedQuery("utenti.findAll");
		return q.getResultList();
	}
	
	public static Utente findUtenteById(Long id) {
		Query q = em.createNamedQuery("utenti.findId");
		q.setParameter("id", id);
		return (Utente) q.getSingleResult();
		}
	
	public static void addUtente(Utente u) {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		System.out.println("Nuovo utente salvato!");
	}
	
	public static void dellUtente(Utente u) {
		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();
		System.out.println("utente eliminato!");
	}
	
	public static Utente findUtenteByTessera(Long numero) {
		Query q = em.createNamedQuery("utenti.findTessera");
		q.setParameter("tessera", numero);
		return (Utente) q.getSingleResult();

		}

	
	public static boolean isTesseraOfUtenteValid(Utente utente) {
	    Tessera tessera = utente.getTessera();
	    LocalDate dataScadenza = tessera.getData_scadenza();
	    LocalDate now = LocalDate.now();
	    return dataScadenza.isAfter(now) || dataScadenza.isEqual(now);
	}
	
}

package negozi;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import JPA_util.JpaUtil;
import tessere.Tessera;
import tessere.TesseraDAO;
import titoli.Abbonamento;
import titoli.Biglietto;
import titoli.TipoAbbonamento;
import titoli.TitoliDAO;
import titoli.Titolo;
import tratte.Tratta;
import utenti.Utente;
import utenti.UtentiDAO;

public class negoziDAO {

	static EntityManager em = JpaUtil.getEmf().createEntityManager();
	
	public static void main(String[] args) {
		

		try {
//			List<PuntiVendita> listaPuntivendita;
//			Distributore P1 = new Distributore();
//			P1.setNome("Da Erminio Ottone il bigliettaio");
//			P1.setAttivo(true);
//			addPuntoVendita(P1);
//			
//			Biglietto B1 = new Biglietto();
//			B1.setData_emissione(LocalDate.of(2023, 4, 5));
//			B1.setPunto_vendita(P1);
//			TitoliDAO.addTitolo(B1);
//						
//			Tessera T1 = new Tessera();
//			T1.setData_creazione(LocalDate.of(2023, 4, 5));
//			TesseraDAO.addTessera(T1);
//
//			Utente U1 = new Utente();
//			U1.setNome("giacomo");
//			U1.setCognome("Cognome");
//			U1.setTessera(T1);
//			UtentiDAO.addUtente(U1);
//			
//			Abbonamento A1 = new Abbonamento();
//			A1.setData_emissione(LocalDate.of(2024, 4, 5));
//			A1.setTessera(T1);
//			A1.setDurata(TipoAbbonamento.MENSILE);
//			A1.setData_inizio(LocalDate.of(2024, 5, 1), A1.getDurata());
//			A1.setPunto_vendita(P1);
//			TitoliDAO.addTitolo(A1);
//	
//			listaPuntivendita = findAllPuntiVendita();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			em.close();
		}

	}
	
	public static List<PuntiVendita> findAllPuntiVendita() {
		Query q = em.createNamedQuery("titoli.findAll");
		return q.getResultList();
	}
	
	public static void addPuntoVendita(PuntiVendita e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println("Nuovo punto vendita creato!");
	}
	
	public static void dellPuntoVendita(PuntiVendita e) {
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
		System.out.println("Punto vendita eliminato!");
	}
	public static PuntiVendita findNegozioByID(Long id) {
		Query q = em.createNamedQuery("findNegozioById");
		q.setParameter("id", id);
		return (PuntiVendita) q.getSingleResult();
	}
	
	
}

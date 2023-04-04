package titoli;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.*;
import JPA_util.JpaUtil;

public class TitoliDAO {
	
	static EntityManager em = JpaUtil.getEmf().createEntityManager();
	
	public static void main(String[] args) {
		
		
		
		//List<Titolo> listaTitoli = findAllTitoli();
		
		try {
			
//			Abbonamento A1 = new Abbonamento();
//			A1.setData_emissione(LocalDate.of(2023, 4, 4));
//			A1.setDurata(TipoAbbonamento.MENSILE);
//            A1.setData_inizio(LocalDate.of(2020, 2, 7), A1.getDurata());
//			//System.out.println(A1.toString());
//			//addTitolo(A1);
//			
//			Biglietto B1 = new Biglietto();
//			B1.setData_emissione(LocalDate.of(2023, 4, 4));
//			//System.out.println(B1.toString());
//			//addTitolo(B1);
//			
//			Abbonamento A2 = new Abbonamento();
//            A2.setData_emissione(LocalDate.of(2023, 3, 28));
//            A2.setDurata(TipoAbbonamento.SETTIMANALE);
//            A2.setData_inizio(LocalDate.of(2020, 2, 7), A2.getDurata());
//            //System.out.println(A2.toString());
//            //addTitolo(A2);
//
//            Biglietto B2 = new Biglietto();
//            B2.setData_emissione(LocalDate.of(2023, 4, 3));
//            //System.out.println(B2.toString());
//            //addTitolo(B2);
//            
//            Abbonamento A3 = new Abbonamento();
//            A3.setData_emissione(LocalDate.of(2023, 2, 28));
//            A3.setDurata(TipoAbbonamento.SETTIMANALE);
//            A3.setData_inizio(LocalDate.of(2020, 2, 7), A3.getDurata());
//            //System.out.println(A3.toString());
//            //addTitolo(A3);
//
//            Biglietto B3 = new Biglietto();
//            B3.setData_emissione(LocalDate.of(2023, 5, 3));
//            //System.out.println(B3.toString());
//            //addTitolo(B3);
//            
//            Abbonamento A4 = new Abbonamento();
//            A4.setData_emissione(LocalDate.of(2020, 2, 7));
//            A4.setDurata(TipoAbbonamento.MENSILE);
//            A4.setData_inizio(LocalDate.of(2020, 2, 7), A4.getDurata());
//            //System.out.println(A4.toString());
//            //addTitolo(A4);
//
//            Biglietto B4 = new Biglietto();
//            B4.setData_emissione(LocalDate.of(2022,5,6));
//            //System.out.println(B4.toString());
//            //addTitolo(B4);
//            
//           B1.setVidimato(true);
//           //System.out.println(B1.toString());
//			
//           //Titolo letto = serchByNum(2l);
          
            
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
		System.out.println("itolo eliminato!");
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

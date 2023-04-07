package tessere;

import JPA_util.JpaUtil;
import titoli.Abbonamento;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class TesseraDAO {
	
	static EntityManager em = JpaUtil.getEmf().createEntityManager();

	public static void main(String[] args) {
		
		
		
		try {
//			List<Tessera> listaTessere;
//			Tessera T1 = new Tessera();
//			T1.setData_creazione(LocalDate.of(2022, 4, 1));
//			addTessera(T1);
//			
//			Tessera T2 = new Tessera();
//			T2.setData_creazione(LocalDate.of(2023, 2, 7));
//			addTessera(T2);
//			
//			Tessera T3 = new Tessera();
//			T3.setData_creazione(LocalDate.of(2022, 5, 7));
//			addTessera(T3);
//			
//			Tessera T4 = new Tessera();
//			T4.setData_creazione(LocalDate.of(2022, 11, 6));
//			addTessera(T4);
//			
//			Tessera T5 = new Tessera();
//			T5.setData_creazione(LocalDate.of(2022, 7, 12));
//			addTessera(T5);

//			listaTessere = findAllTessere();
//			listaTessere.forEach(el -> System.out.println(el));
			

			Tessera tessera = serchByid(1001l);
            boolean isValid = isAbbonamentoValid(tessera);
            if (isValid) {
                System.out.println("Abbonamento valido!");
            } else {
                System.out.println("Abbonamento scaduto o inesistente!");
            }
			

		}catch(Exception e){
			e.printStackTrace();
		}finally {
			em.close();
		}

	}

	public static List<Tessera> findAllTessere() {
		Query q = em.createNamedQuery("tessere.findAll");
		return q.getResultList();
	}
	
	public static void addTessera(Tessera t) {
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		System.out.println("Nuova tessera creata!");
	}
	
	public static void dellTessera(Tessera t) {
		em.getTransaction().begin();
		em.remove(t);
		em.getTransaction().commit();
		System.out.println("Tessera eliminata!");
	}
	
	public static Tessera serchByid(Long id) {
		em.getTransaction().begin();
		
		TypedQuery<Tessera> query = (TypedQuery<Tessera>) em.createQuery("SELECT t FROM Tessera t WHERE t.id = :id");
		query.setParameter("id", id);
		Tessera resultp = query.getSingleResult();
		
		em.getTransaction().commit();
		
	    if (resultp != null) {
	    	System.out.println(resultp.toString());
	    } else {
	        System.out.println("Nessuna tessera trovata con questo numero " + id);
	    }
	    return resultp;
	}
	
	public static boolean isAbbonamentoValid(Tessera tessera) {
        boolean isValid = false;

        try {
            TypedQuery<Abbonamento> abbonamentoQuery = em.createQuery("SELECT a FROM Abbonamento a WHERE a.tessera = :tessera", Abbonamento.class);
            abbonamentoQuery.setParameter("tessera", tessera);
            List<Abbonamento> abbonamenti = abbonamentoQuery.getResultList();
            if (!abbonamenti.isEmpty()) {
                Abbonamento abbonamento = abbonamenti.get(0);
                LocalDate dataScadenza = abbonamento.getData_scadenza();
                LocalDate now = LocalDate.now();
                isValid = now.isBefore(dataScadenza);
            }

        } finally {
            em.close();
        }

        return isValid;
    }
	
}

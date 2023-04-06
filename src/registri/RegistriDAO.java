package registri;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import JPA_util.JpaUtil;
import titoli.Biglietto;
import titoli.Titolo;
import tratte.Tratta;
import tratte.TratteDAO;

public class RegistriDAO {

	
	static EntityManager em = JpaUtil.getEmf().createEntityManager();
	
	public static void main(String[] args) {
		
		
		try {
			estraiTempo(1l);
    
	}catch(Exception e){
		e.printStackTrace();
	}finally {
		em.close();
	}
	
}	
	
	public static void estraiTempo (Long id) {
        em.getTransaction().begin();		
		TypedQuery<LocalTime> query1 = (TypedQuery<LocalTime>) em.createQuery("SELECT init_viaggio FROM Registro_viaggi t WHERE t.id = :id");
		query1.setParameter("id", id);
		LocalTime partenza = query1.getSingleResult();
		TypedQuery<LocalTime> query2 = (TypedQuery<LocalTime>) em.createQuery("SELECT fine_viaggio FROM Registro_viaggi t WHERE t.id = :id");
		query2.setParameter("id", id);
		LocalTime arrivo = query2.getSingleResult();
		em.getTransaction().commit();
		calcoloTempo(id, partenza, arrivo);
			
	}
	
	public static long calcoloTempo(Long id, LocalTime inizio, LocalTime fine) {
		 long result = 0;
		 Duration duration = Duration.between(inizio, fine);
		 result = duration.toMinutes();
		System.out.println(result);
		caricaTempoMedio(id, result);
		return result;
	}
	
	public static void caricaTempoMedio(long id,long tempo) {	
		List<Long> totTempo = null;
		totTempo.add(tempo);
		Tratta t = TratteDAO.findTrattaByID(id);
		
		long results = totTempo
		.stream()
		.reduce((long) 0, (subtotal, x)-> subtotal + x);
		t.setDurata_media(results);
	    em.getTransaction().begin();
	    em.merge(t);
		em.getTransaction().commit();
	}
	
	////reduce da provare

}

package registri;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Iterator;
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
		TypedQuery<LocalTime> query1 = (TypedQuery<LocalTime>) em.createQuery("SELECT init_viaggio FROM Registro_viaggi t WHERE id_tratta = :id");
		query1.setParameter("id", id);
		List<LocalTime> partenza = query1.getResultList();
		TypedQuery<LocalTime> query2 = (TypedQuery<LocalTime>) em.createQuery("SELECT fine_viaggio FROM Registro_viaggi t WHERE id_tratta = :id");
		query2.setParameter("id", id);
		List<LocalTime> arrivo = query2.getResultList();
		em.getTransaction().commit();		
		calcoloTempo(id, partenza, arrivo);			
	}
	
	public static long calcoloTempo(Long id, List<LocalTime> partenza, List<LocalTime> arrivo) {
		 long result = 0;
		 Long totTempo = 0l;
		 partenza.parallelStream();
		 arrivo.parallelStream();
		 Iterator<LocalTime> start = partenza.iterator();
   		 Iterator<LocalTime> end = arrivo.iterator();
   		 for(int i = 0; i< arrivo.size(); i++) {
		 Duration duration = Duration.between(start.next(), end.next());
		 result = duration.toMinutes();
		 totTempo = totTempo + result;
   		 }
   		 Long tempoMedio = totTempo / arrivo.size();	
   		 caricaTempoMedio(id, tempoMedio);

		return tempoMedio;
	}
	
	public static void caricaTempoMedio(long id,long tempo) {	
		Tratta t = TratteDAO.findTrattaByID(id);
		t.setDurata_media(tempo);
	    em.getTransaction().begin();
	    em.merge(t);
		em.getTransaction().commit();
	}
	

}

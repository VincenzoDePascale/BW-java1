package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import JPA_util.JpaUtil;
import negozi.*;
import mezzi.*;
import registri.*;
import tessere.*;
import titoli.*;
import tratte.*;
import utenti.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class Main {

	static EntityManager em = JpaUtil.getEmf().createEntityManager();
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		List<ParcoMezzi> listaMezzi; /*TM-BS*/
		List<PuntiVendita> listaPuntivendita; /*RV-DB*/
		//lst registri
		List<Tessera> listaTessere; /*TS*/
		List<Titolo> listaTitoli; /*AB - BB*/
		List<Tratta> listTratte; /*TA*/
		List<Utente> listaUtente; /*UT*/
				
		try {
			
			//creazione tratte
			Tratta TA1 = new Tratta();
			TA1.setNome_tratta("Na-Sa");
			TA1.setPartenza("Napoli");
			TA1.setCapolinea("Salerno");
			//addElement(TA1);
			
			//creazione mezzi
			ParcoMezzi TM1 = new ParcoMezzi();
			TM1.setTipo_mezzo(TipoMezzo.TRAM);
			TM1.setNome("Tram3");
			TM1.setIn_servizio(true);
			TM1.setCapienza(100);
			TM1.setTratta(TA1);
			//addElement(TM1);
			
			ParcoMezzi BS1 = new ParcoMezzi();
			BS1.setTipo_mezzo(TipoMezzo.BUS);
			BS1.setNome("Bus2");
			BS1.setIn_servizio(true);
			BS1.setCapienza(100);
			BS1.setTratta(TA1);
			//addElement(BS1);
			
			//negoziDAO
			Distributore DB1 = new Distributore();
			DB1.setNome("Da Erminio Ottone il bigliettaio");
			DB1.setAttivo(true);
			//addElement(DB1);
			
			Rivenditore RV1 = new Rivenditore();
			RV1.setNome("Rivendi Tore");
			RV1.setApertura(LocalTime.parse("09:30"));
			RV1.setChiusura(LocalTime.parse("18:30"));
			//addElement(RV1);
			
			PuntiVendita t = negoziDAO.findNegozioByID(1l);
			Biglietto BB1 = new Biglietto();
			BB1.setData_emissione(LocalDate.of(2023, 4, 5));
			BB1.setPunto_vendita(t);			
			//addElement(BB1);
			TitoliDAO.calcolaBiglietti(6l);						
			Tessera TS1 = new Tessera();
			TS1.setData_creazione(LocalDate.of(2023, 4, 5));
			//addElement(TS1);

			Utente UT1 = new Utente();
			UT1.setNome("Vincenzo");
			UT1.setCognome("De Saverio");
			UT1.setTessera(TS1);
			//addElement(UT1);
			
			Tessera Tess = TesseraDAO.serchByid(1043l);
			Abbonamento AB1 = new Abbonamento();
			AB1.setData_emissione(LocalDate.of(2024, 4, 5));
			AB1.setTessera(Tess);
			AB1.setDurata(TipoAbbonamento.MENSILE);
			AB1.setData_inizio(LocalDate.of(2024, 5, 1), AB1.getDurata());
			AB1.setPunto_vendita(t);
			//addElement(AB1);
			TitoliDAO.calcolaAbbonamenti(6l);	
			
			//registro manutenzione
			Registro_manutenzione RM1 = new Registro_manutenzione();
			RM1.setInit_manutenzione(LocalDate.of(2023, 2, 5));
			RM1.setFine_manutenzione(LocalDate.of(2023, 3, 5));
			RM1.setParco_mezzi(BS1);
			RM1.setNome(BS1.getNome());
			//addElement(RM1);
			
			Registro_viaggi V1 = new Registro_viaggi();
			V1.setInit_viaggio(LocalTime.parse("11:30"));
			V1.setFine_viaggio(LocalTime.parse("15:20"));
			V1.setTratta(TratteDAO.findTrattaByID(1l));
			V1.setParco_mezzi(MezziDAO.findMezziByID(1l));
			V1.setNome(BS1.getNome());
			//addElement(V1);
			
			
			//TitoliDAO.validaBiglietto(1l);
			//System.out.println(TitoliDAO.findtitoloDaNegozio(1L));
			
			
			
			
			//listaMezzi = MezziDAO.findAllMezzi();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			em.close();
		}
		
	}
	
	public static void addElement(Object e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println("Nuova creazione andata a buon fine!");
	}
	
	public static void dellElement(Object e) {
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
		System.out.println("eliminazione andata a buon fine!");
	}

}

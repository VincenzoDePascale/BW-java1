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
			TA1.setNome_tratta("Ro-Mi");
			TA1.setPartenza("Roma");
			TA1.setCapolinea("Milano");
			//addElement(TA1);
			
			//creazione mezzi
			ParcoMezzi TM1 = new ParcoMezzi();
			TM1.setTipo_mezzo(TipoMezzo.TRAM);
			TM1.setNome("Tram1");
			TM1.setIn_servizio(true);
			TM1.setCapienza(100);
			TM1.setTratta(TA1);
			//addElement(TM1);
			
			ParcoMezzi BS1 = new ParcoMezzi();
			BS1.setTipo_mezzo(TipoMezzo.BUS);
			BS1.setNome("Bus1");
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
			addElement(RV1);
			
			Biglietto BB1 = new Biglietto();
			BB1.setData_emissione(LocalDate.of(2023, 4, 5));
			BB1.setPunto_vendita(DB1);
			//addElement(BB1);
						
			Tessera TS1 = new Tessera();
			TS1.setData_creazione(LocalDate.of(2023, 4, 5));
			//addElement(TS1);

			Utente UT1 = new Utente();
			UT1.setNome("giacomo");
			UT1.setCognome("Cognome");
			UT1.setTessera(TS1);
			//addElement(UT1);
			
			Abbonamento AB1 = new Abbonamento();
			AB1.setData_emissione(LocalDate.of(2024, 4, 5));
			AB1.setTessera(TS1);
			AB1.setDurata(TipoAbbonamento.MENSILE);
			AB1.setData_inizio(LocalDate.of(2024, 5, 1), AB1.getDurata());
			AB1.setPunto_vendita(DB1);
			//addElement(AB1);
			
			
			
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

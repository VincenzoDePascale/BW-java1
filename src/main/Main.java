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
//		List<ParcoMezzi> listaMezzi; /*TM-BS*/
//		List<PuntiVendita> listaPuntivendita; /*RV-DB*/
//		//lst registri
//		List<Tessera> listaTessere; /*TS*/
//		List<Titolo> listaTitoli; /*AB - BB*/
//		List<Tratta> listTratte; /*TA*/
//		List<Utente> listaUtente; /*UT*/
				
		try {
			
			//creazione tratte
			Tratta TA1 = new Tratta();
			TA1.setNome_tratta("Na-Sa");
			TA1.setPartenza("Napoli");
			TA1.setCapolinea("Salerno");
						
			Tratta TA2 = new Tratta();
			TA2.setNome_tratta("Sa-Na");
			TA2.setPartenza("Salerno");
			TA2.setCapolinea("Napoli");
						
			Tratta TA3 = new Tratta();
			TA3.setNome_tratta("Ro-Na");
			TA3.setPartenza("Roma");
			TA3.setCapolinea("Napoli");
						
			Tratta TA4 = new Tratta();
			TA4.setNome_tratta("Na-Ro");
			TA4.setPartenza("Napoli");
			TA4.setCapolinea("Roma");
			
			Tratta TA5 = new Tratta();
            TA5.setNome_tratta("Pa-Me");
            TA5.setPartenza("Palermo");
            TA5.setCapolinea("Messina");
            
            Tratta TA6 = new Tratta();
            TA6.setNome_tratta("Me-Pa");
            TA6.setPartenza("Messina");
            TA6.setCapolinea("Palermo");
            
            Tratta TA7 = new Tratta();
            TA7.setNome_tratta("Ca-Me");
            TA7.setPartenza("Catania");
            TA7.setCapolinea("Messina");
            
            Tratta TA8 = new Tratta();
            TA8.setNome_tratta("Me-Ca");
            TA8.setPartenza("Messina");
            TA8.setCapolinea("Catania");
            
            Tratta TA9 = new Tratta();
            TA9.setNome_tratta("Ca-Pa");
            TA9.setPartenza("Catania");
            TA9.setCapolinea("Palermo");
            
            Tratta TA10 = new Tratta();
            TA10.setNome_tratta("Pa-Ca");
            TA10.setPartenza("Palermo");
            TA10.setCapolinea("Catania");
            
            //add tratte
            System.out.println("creazione tratte");
          addElement(TA1);
          addElement(TA2);
		addElement(TA3);
			addElement(TA4);
		addElement(TA5);
          addElement(TA6);
          addElement(TA7);
          addElement(TA8);
          addElement(TA9);
          addElement(TA10);
								
			//creazione mezzi
			ParcoMezzi TM1 = new ParcoMezzi();
			TM1.setTipo_mezzo(TipoMezzo.TRAM);
			TM1.setNome("Tram1");
			TM1.setIn_servizio(true);
			TM1.setCapienza(100);
			TM1.setTratta(TA1);
						
			ParcoMezzi BS1 = new ParcoMezzi();
			BS1.setTipo_mezzo(TipoMezzo.BUS);
			BS1.setNome("Bus1");
			BS1.setIn_servizio(true);
			BS1.setCapienza(50);
			BS1.setTratta(TA1);
			
			ParcoMezzi TM2 = new ParcoMezzi();
			TM2.setTipo_mezzo(TipoMezzo.TRAM);
			TM2.setNome("Tram2");
			TM2.setIn_servizio(true);
			TM2.setCapienza(100);
			TM2.setTratta(TA2);
						
			ParcoMezzi BS2 = new ParcoMezzi();
			BS2.setTipo_mezzo(TipoMezzo.BUS);
			BS2.setNome("Bus2");
			BS2.setIn_servizio(true);
			BS2.setCapienza(50);
			BS2.setTratta(TA2);
						
			ParcoMezzi TM3 = new ParcoMezzi();
			TM3.setTipo_mezzo(TipoMezzo.TRAM);
			TM3.setNome("Tram3");
			TM3.setIn_servizio(true);
			TM3.setCapienza(100);
			TM3.setTratta(TA3);
						
			ParcoMezzi BS3 = new ParcoMezzi();
			BS3.setTipo_mezzo(TipoMezzo.BUS);
			BS3.setNome("Bus3");
			BS3.setIn_servizio(true);
			BS3.setCapienza(50);
			BS3.setTratta(TA3);
						
			ParcoMezzi TM4 = new ParcoMezzi();
			TM4.setTipo_mezzo(TipoMezzo.TRAM);
			TM4.setNome("Tram4");
			TM4.setIn_servizio(true);
			TM4.setCapienza(100);
			TM4.setTratta(TA4);
						
			ParcoMezzi BS4 = new ParcoMezzi();
			BS4.setTipo_mezzo(TipoMezzo.BUS);
			BS4.setNome("Bus4");
			BS4.setIn_servizio(true);
			BS4.setCapienza(50);
			BS4.setTratta(TA4);
						
			ParcoMezzi TM5 = new ParcoMezzi();
			TM5.setTipo_mezzo(TipoMezzo.TRAM);
			TM5.setNome("Tram5");
			TM5.setIn_servizio(true);
			TM5.setCapienza(100);
			TM5.setTratta(TA5);
						
			ParcoMezzi BS5 = new ParcoMezzi();
			BS5.setTipo_mezzo(TipoMezzo.BUS);
			BS5.setNome("Bus5");
			BS5.setIn_servizio(true);
			BS5.setCapienza(50);
			BS5.setTratta(TA5);
					
			ParcoMezzi TM6 = new ParcoMezzi();
			TM6.setTipo_mezzo(TipoMezzo.TRAM);
			TM6.setNome("Tram6");
			TM6.setIn_servizio(true);
			TM6.setCapienza(100);
			TM6.setTratta(TA6);
						
			ParcoMezzi BS6 = new ParcoMezzi();
			BS6.setTipo_mezzo(TipoMezzo.BUS);
			BS6.setNome("Bus6");
			BS6.setIn_servizio(true);
			BS6.setCapienza(50);
			BS6.setTratta(TA6);
						
			ParcoMezzi TM7 = new ParcoMezzi();
			TM7.setTipo_mezzo(TipoMezzo.TRAM);
			TM7.setNome("Tram7");
			TM7.setIn_servizio(true);
			TM7.setCapienza(100);
			TM7.setTratta(TA7);
						
			ParcoMezzi BS7 = new ParcoMezzi();
			BS7.setTipo_mezzo(TipoMezzo.BUS);
			BS7.setNome("Bus7");
			BS7.setIn_servizio(true);
			BS7.setCapienza(50);
			BS7.setTratta(TA7);
						
			ParcoMezzi TM8 = new ParcoMezzi();
			TM8.setTipo_mezzo(TipoMezzo.TRAM);
			TM8.setNome("Tram8");
			TM8.setIn_servizio(true);
			TM8.setCapienza(100);
			TM8.setTratta(TA8);
						
			ParcoMezzi BS8 = new ParcoMezzi();
			BS8.setTipo_mezzo(TipoMezzo.BUS);
			BS8.setNome("Bus8");
			BS8.setIn_servizio(true);
			BS8.setCapienza(50);
			BS8.setTratta(TA8);
			
			ParcoMezzi TM9 = new ParcoMezzi();
			TM9.setTipo_mezzo(TipoMezzo.TRAM);
			TM9.setNome("Tram9");
			TM9.setIn_servizio(true);
			TM9.setCapienza(100);
			TM9.setTratta(TA9);
						
			ParcoMezzi BS9 = new ParcoMezzi();
			BS9.setTipo_mezzo(TipoMezzo.BUS);
			BS9.setNome("Bus9");
			BS9.setIn_servizio(true);
			BS9.setCapienza(50);
			BS9.setTratta(TA9);
						
			ParcoMezzi TM10 = new ParcoMezzi();
			TM10.setTipo_mezzo(TipoMezzo.TRAM);
			TM10.setNome("Tram10");
			TM10.setIn_servizio(true);
			TM10.setCapienza(100);
			TM10.setTratta(TA10);
						
			ParcoMezzi BS10 = new ParcoMezzi();
			BS10.setTipo_mezzo(TipoMezzo.BUS);
			BS10.setNome("Bus10");
			BS10.setIn_servizio(true);
			BS10.setCapienza(50);
			BS10.setTratta(TA10);
			
			//add bus e tram
			addElement(TM1);
			addElement(BS1);
			addElement(TM2);
			addElement(BS2);
			addElement(TM3);
			addElement(BS3);
			addElement(TM4);
			addElement(BS4);
			addElement(TM5);
			addElement(BS5);
			addElement(TM6);
			addElement(BS6);
			addElement(TM7);
			addElement(BS7);
			addElement(TM8);
			addElement(BS8);
			addElement(TM9);
			addElement(BS9);
			addElement(TM10);
			addElement(BS10);
			
			//distributori
			Distributore DB1 = new Distributore();
			DB1.setNome("distributore1");
			DB1.setAttivo(true);
			
			Distributore DB2 = new Distributore();
			DB2.setNome("distributore2");
			DB2.setAttivo(true);
			
			Distributore DB3 = new Distributore();
			DB3.setNome("distributore3");
			DB3.setAttivo(true);
			
			Distributore DB4 = new Distributore();
			DB4.setNome("distributore4");
			DB4.setAttivo(true);
			
			Distributore DB5 = new Distributore();
			DB5.setNome("distributore5");
			DB5.setAttivo(true);
			
			//add distributori
			addElement(DB1);
			addElement(DB2);
			addElement(DB3);
			addElement(DB4);
			addElement(DB5);
			
			//rivenditori
			Rivenditore RV1 = new Rivenditore();
			RV1.setNome("Rivenditore1");
			RV1.setApertura(LocalTime.parse("07:30"));
			RV1.setChiusura(LocalTime.parse("20:00"));
			
			Rivenditore RV2 = new Rivenditore();
			RV2.setNome("Rivenditore2");
			RV2.setApertura(LocalTime.parse("07:30"));
			RV2.setChiusura(LocalTime.parse("14:30"));
			
			Rivenditore RV3 = new Rivenditore();
			RV3.setNome("Rivenditore3");
			RV3.setApertura(LocalTime.parse("14:30"));
			RV3.setChiusura(LocalTime.parse("20:00"));
			
			Rivenditore RV4 = new Rivenditore();
			RV4.setNome("Rivenditore4");
			RV4.setApertura(LocalTime.parse("07:30"));
			RV4.setChiusura(LocalTime.parse("14:30"));
			
			Rivenditore RV5 = new Rivenditore();
			RV5.setNome("Rivenditore5");
			RV5.setApertura(LocalTime.parse("14:30"));
			RV5.setChiusura(LocalTime.parse("20:00"));
			
			//add rivenditori
			addElement(RV1);
			addElement(RV2);
			addElement(RV3);
			addElement(RV4);
			addElement(RV5);
			
			Tessera TS1 = new Tessera();
            TS1.setData_creazione(LocalDate.of(2023, 6, 4));
            Tessera TS2 = new Tessera();
            TS2.setData_creazione(LocalDate.of(2023, 5, 5));
            Tessera TS3 = new Tessera();
            TS3.setData_creazione(LocalDate.of(2023, 4, 6));
            Tessera TS4 = new Tessera();
            TS4.setData_creazione(LocalDate.of(2023, 3, 7));
            Tessera TS5 = new Tessera();
            TS5.setData_creazione(LocalDate.of(2023, 2, 8));
            addElement(TS1);
            addElement(TS2);
            addElement(TS3);
            addElement(TS4);
            addElement(TS5);

            Utente UT1 = new Utente();
            UT1.setNome("Vincenzo");
            UT1.setCognome("De Pascale");
            UT1.setTessera(TS1);
            Utente UT2 = new Utente();
            UT2.setNome("Vincenzo");
            UT2.setCognome("Picone");
            UT2.setTessera(TS2);
            Utente UT3 = new Utente();
            UT3.setNome("Carlos");
            UT3.setCognome("Sarmiento");
            UT3.setTessera(TS3);
            Utente UT4 = new Utente();
            UT4.setNome("Saverio");
            UT4.setCognome("Caracappa");
            UT4.setTessera(TS4);
            Utente UT5 = new Utente();
            UT5.setNome("Adina");
            UT5.setCognome("Iamandi");
            UT5.setTessera(TS5);
            addElement(UT1);
            addElement(UT2);
            addElement(UT3);
            addElement(UT4);
            addElement(UT5);


			
			
			//TitoliDAO.calcolaAbbonamenti(6l);	
			
			//registro manutenzione
			Registro_manutenzione RM1 = new Registro_manutenzione();
			RM1.setInit_manutenzione(LocalDate.of(2023, 2, 5));
			RM1.setFine_manutenzione(LocalDate.of(2023, 3, 5));
			RM1.setParco_mezzi(BS1);
			RM1.setNome(BS1.getNome());
			//addElement(RM1);
			
//			Registro_viaggi V1 = new Registro_viaggi();
//			V1.setInit_viaggio(LocalTime.parse("11:30"));
//			V1.setFine_viaggio(LocalTime.parse("15:20"));
//			V1.setTratta(TratteDAO.findTrattaByID(1l));
//			V1.setParco_mezzi(MezziDAO.findMezziByID(1l));
//			V1.setNome(BS1.getNome());
//			//addElement(V1);
			
			
			//TitoliDAO.validaBiglietto(1l);
			//System.out.println(TitoliDAO.findtitoloDaNegozio(1L));
			
			//listaMezzi = MezziDAO.findAllMezzi();
			
			//creazioneTratta();
			//creazioneMezzo();
			//nuovoBiglietto();
			nuovoAbbonamento();
			
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
	
	public static void creazioneTratta() {
		System.out.println("inizio crezione tratta");
		Tratta TA1 = new Tratta();
		System.out.println("Inserisci partenza");
		String partenza = scanner.next();
		System.out.println("Inserisci arrivo");
		String arrivo = scanner.next();
		TA1.setPartenza(partenza);
		TA1.setCapolinea(arrivo);
		TA1.setNome_tratta(partenza + "-" + arrivo);
		addElement(TA1);
		System.out.println("fine crezione tratta");
		
	}
	
	public static void creazioneMezzo() {
		System.out.println("inizio crezione mazzo");
		ParcoMezzi TM1 = new ParcoMezzi();
		
		System.out.println("il mezzo che stai creadondo dovrà essere assegnato ad una tratta:\n premi 1 se conosci già la tratta\npremi 2 per creare una tratta");
		int newTratta = scanner.nextInt();
		scanner.nextLine();
		switch(newTratta) {
		case 1:
			System.out.println("elenco tratte esistenti");
			System.out.println(TratteDAO.findAllTratte());
		break;
		case 2:
			System.out.println("crea la tua nuova tratta");
			creazioneTratta();
		break;
		}
		
		System.out.println("selezionare il tipo di mezzo\n1 tram\n2 bus");
		int tipoMezzo = scanner.nextInt();
		scanner.nextLine();
		switch(tipoMezzo) {
			case 1:
				TM1.setTipo_mezzo(TipoMezzo.TRAM);
				TM1.setCapienza(100);
			break;
			case 2:
				TM1.setTipo_mezzo(TipoMezzo.BUS);
				TM1.setCapienza(50);
			break;
		}
		System.out.println("Inserire il nome");
		String nome_mezzo = scanner.next();
		TM1.setNome(nome_mezzo);
		System.out.println("questo mezzo è in serivizio\n1 per si\\n2 per no");
		int in_servizio = scanner.nextInt();
		scanner.nextLine();
		switch(in_servizio) {
		case 1:
			TM1.setIn_servizio(true);
		break;
		case 2:
			TM1.setIn_servizio(false);
		break;
		}
		
		System.out.println("inserisci il codice della tratta seguito dalla lettera l");
		Long codice = scanner.nextLong();
		scanner.nextLine();
		
		TM1.setTratta(TratteDAO.findTrattaByID(codice));
	}
	
	public static void creaNuovoTitolo() {
        System.out.println("Cosa vuoi creare?");
        System.out.println("1 - per biglietto");
        System.out.println("2 - per abbonamento");
        System.out.println("0 - per uscire");
        int scelta = scanner.nextInt();
        scanner.nextLine();
        switch (scelta) {
        case 1:
            nuovoBiglietto();
            break;
        case 2:
            //nuovoAbbonamento();
            break;
        default:
            System.exit(0);
        }
    }


    public static void nuovoBiglietto() {
        System.out.println("Scegli il tuo negozio");
        Biglietto BB1 = new Biglietto();
        Long scelta = scanner.nextLong();
        scanner.nextLine();
        PuntiVendita t = negoziDAO.findNegozioByID(scelta);
        BB1.setPunto_vendita(t);
        System.out.println("inserisci anno");
        int anno = scanner.nextInt();
        scanner.nextLine();
        System.out.println("inserisci mese");
        int mese = scanner.nextInt();
        scanner.nextLine();
        System.out.println("inserisci giorno");
        int giorno = scanner.nextInt();
        scanner.nextLine();
        BB1.setData_emissione(LocalDate.of(anno, mese, giorno));
        addElement(BB1);
        TitoliDAO.calcolaBiglietti(scelta);
        }

    public static void nuovoAbbonamento() {
    	Abbonamento AB1 = new Abbonamento();
    	
    	 System.out.println("Scegli il tuo negozio");
    	 Long scelta = scanner.nextLong();
         scanner.nextLine();
         PuntiVendita t = negoziDAO.findNegozioByID(scelta);
         AB1.setPunto_vendita(t);
         
         System.out.println("emessione");
         System.out.println("inserisci anno");
         int anno = scanner.nextInt();
         scanner.nextLine();
         System.out.println("inserisci mese");
         int mese = scanner.nextInt();
         scanner.nextLine();
         System.out.println("inserisci giorno");
         int giorno = scanner.nextInt();
         scanner.nextLine();
         AB1.setData_emissione(LocalDate.of(anno, mese, giorno));
         
         System.out.println("Scegli codice tessera");
    	 Long codTessera = scanner.nextLong();
         scanner.nextLine();
         Tessera tttt = TesseraDAO.serchByid(codTessera);
         AB1.setTessera(tttt);
         
         AB1.setDurata(TipoAbbonamento.MENSILE);
         addElement(AB1);
		TitoliDAO.calcolaAbbonamenti(scelta);
    }
    
    
	
}

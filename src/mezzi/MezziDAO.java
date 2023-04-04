package mezzi;

import JPA_util.JpaUtil;
import java.time.LocalDate;
import main.Main;

public class MezziDAO {

	public static void main(String[] args) {
		
	}
	
	public static void creaNuovoMezzo() {
		System.out.println("Quale mezzo vuoi creare?");
		System.out.println("1 - per aggiungere un BUS");
		System.out.println("2 - per aggiungere un TRAM");
		int scelta = Main.scanner.nextInt();
		TipoMezzo tipoMezzo;
		switch (scelta) {
		case 1:
			tipoMezzo = TipoMezzo.BUS;
			System.out.println("Inserisci il nome o il numero del mezzo");
			String nomeMezzo = Main.scanner.next();
			System.out.println("Inserisci la capienza");
			int capienza = Main.scanner.nextInt();
			System.out.println("Il mezzo è in servizio?");
			System.out.println("1 - in servizio");
			System.out.println("2 - in manutenzione");
			int sceltaServizio = Main.scanner.nextInt();
			switch(sceltaServizio) {
			case 1:
				ParcoMezzi mezzo1 = new ParcoMezzi(tipoMezzo, nomeMezzo, true, capienza);
				break;
			case 2:
				System.out.println("Inserisci la data di inizio manutenzione");
				System.out.println("Giorno");
				int giorno = Main.scanner.nextInt();
				System.out.println("Mese");
				int mese = Main.scanner.nextInt();
				System.out.println("Anno");
				int anno = Main.scanner.nextInt();
				ParcoMezzi mezzo2 = new ParcoMezzi(tipoMezzo, nomeMezzo, false, LocalDate.of(anno, mese, giorno), capienza);
			}
			break;
		case 2:
			tipoMezzo = TipoMezzo.TRAM;
			System.out.println("Inserisci il nome o il numero del mezzo");
			nomeMezzo = Main.scanner.next();
			System.out.println("Inserisci la capienza");
			capienza = Main.scanner.nextInt();
			System.out.println("Il mezzo è in servizio?");
			System.out.println("1 - in servizio");
			System.out.println("2 - in manutenzione");
			sceltaServizio = Main.scanner.nextInt();
			switch(sceltaServizio) {
			case 1:
				ParcoMezzi mezzo1 = new ParcoMezzi(tipoMezzo, nomeMezzo, true, capienza);
				break;
			case 2:
				System.out.println("Inserisci la data di inizio manutenzione");
				System.out.println("Giorno");
				int giorno = Main.scanner.nextInt();
				System.out.println("Mese");
				int mese = Main.scanner.nextInt();
				System.out.println("Anno");
				int anno = Main.scanner.nextInt();
				ParcoMezzi mezzo2 = new ParcoMezzi(tipoMezzo, nomeMezzo, false, LocalDate.of(anno, mese, giorno), capienza);
			}
			break;
			default: System.out.println("La scelta non è corretta");
		}
		
		
		
	}

}

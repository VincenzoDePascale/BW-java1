package negozi;

import java.time.LocalDate;

public class Rivenditore extends PuntiVendita {
	
	private LocalDate apertura;
	private LocalDate chiusura;
	
	public Rivenditore () {}

	public Rivenditore(String nome, Long biglietti_emessi, Long abbonamenti_emessi, LocalDate apertura,
			LocalDate chiusura) {
		super(nome, biglietti_emessi, abbonamenti_emessi);
		this.apertura = apertura;
		this.chiusura = chiusura;
	}

	public LocalDate getApertura() {
		return apertura;
	}

	public void setApertura(LocalDate apertura) {
		this.apertura = apertura;
	}

	public LocalDate getChiusura() {
		return chiusura;
	}

	public void setChiusura(LocalDate chiusura) {
		this.chiusura = chiusura;
	}

	@Override
	public String toString() {
		return "Rivenditore [apertura=" + apertura + ", chiusura=" + chiusura + "]";
	}
	
		

}

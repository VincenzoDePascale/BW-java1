package negozi;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Rivenditore extends PuntiVendita {
	
	@Column
	private LocalTime apertura;
	
	@Column
	private LocalTime chiusura;
	
	public Rivenditore () {}

	public Rivenditore(String nome, LocalTime apertura,
			LocalTime chiusura) {
		super(nome);
		this.apertura = apertura;
		this.chiusura = chiusura;
	}

	public LocalTime getApertura() {
		return apertura;
	}

	public void setApertura(LocalTime apertura) {
		this.apertura = apertura;
	}

	public LocalTime getChiusura() {
		return chiusura;
	}

	public void setChiusura(LocalTime chiusura) {
		this.chiusura = chiusura;
	}

	@Override
	public String toString() {
		return "Rivenditore [getId()=" + getId() + ", getNome()=" + getNome() + ", getBiglietti_emessi()="
				+ getBiglietti_emessi() + ", getAbbonamenti_emessi()=" + getAbbonamenti_emessi() + "getApertura()="
				+ getApertura() + ", getChiusura()=" + getChiusura() + "]";
	}

	
}

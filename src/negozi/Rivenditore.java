package negozi;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Rivenditore extends PuntiVendita {
	
	@Column
	private LocalDate apertura;
	
	@Column
	private LocalDate chiusura;
	
	public Rivenditore () {}

	public Rivenditore(String nome, LocalDate apertura,
			LocalDate chiusura) {
		super(nome);
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
		return "Rivenditore [getId()=" + getId() + ", getNome()=" + getNome() + ", getBiglietti_emessi()="
				+ getBiglietti_emessi() + ", getAbbonamenti_emessi()=" + getAbbonamenti_emessi() + "getApertura()="
				+ getApertura() + ", getChiusura()=" + getChiusura() + "]";
	}

	
}

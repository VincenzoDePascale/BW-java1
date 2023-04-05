package negozi;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Distributore extends PuntiVendita {
	
	@Column
	private Boolean attivo;
	
	public Distributore () {}
	
	public Distributore( String nome, Boolean attivo) {
		super(nome);
		this.attivo = attivo;
	}

	public Boolean getAttivo() {
		return attivo;
	}

	public void setAttivo(Boolean attivo) {
		this.attivo = attivo;
	}

	@Override
	public String toString() {
		return "Distributore [getId()=" + getId() + ", getNome()=" + getNome() + ", getBiglietti_emessi()="
				+  getBiglietti_emessi() + ", getAbbonamenti_emessi()=" + getAbbonamenti_emessi()
				+ "getAttivo()=" + getAttivo() + "]";
	}

	

}

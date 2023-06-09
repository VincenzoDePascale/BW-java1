package titoli;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import negozi.PuntiVendita;

@Entity
public class Biglietto extends Titolo{
	
	@Column
	private Boolean vidimato = false;
	
	@Column
	private Boolean valido = true;
	
	public Biglietto () {}
	
	public Biglietto(LocalDate data_emissione, PuntiVendita punto_vendita) {
		super(data_emissione, punto_vendita);
	}


	public Boolean getVidimato() {
		return vidimato;
		
	}

	public void setVidimato(Boolean vidimato) {
		this.vidimato = vidimato;
		this.valido = !vidimato;
	}

	public Boolean getValido() {
		return valido;
	}

	public void setValido(Boolean valido) {
		this.valido = valido;
		this.vidimato = !valido;
		
	}

	@Override
	public String toString() {
		return "Biglietto [getData_emissione()="+ getData_emissione() + "getVidimato()=" + getVidimato() + ", getValido()=" + getValido() + "]";
	}

	
	
	
}

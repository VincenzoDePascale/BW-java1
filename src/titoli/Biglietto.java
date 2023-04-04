package titoli;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Biglietto extends Titolo{
	
	@Column
	private Boolean vidimato;
	
	@Column
	private Boolean valido = true;
	
	public Biglietto () {}
	
	public Biglietto(LocalDate data_emissione) {
		super(data_emissione);
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
		return "Biglietto [vidimato=" + vidimato + ", valido=" + valido + "]";
	}
	
	
}

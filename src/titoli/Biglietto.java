package titoli;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "titoli")
public class Biglietto extends Titolo{
	
	@Column
	private Boolean vidimato;
	
	@Column
	private Boolean valido;
	
	public Biglietto () {}
	
	


	public Biglietto(Long id, Long numero, LocalDate data_emissione, Boolean vidimato, Boolean valido) {
		super(id, numero, data_emissione);
		this.vidimato = vidimato;
		this.valido = valido;
	}


	public Boolean getVidimato() {
		return vidimato;
	}

	public void setVidimato(Boolean vidimato) {
		this.vidimato = vidimato;
	}

	public Boolean getValido() {
		return valido;
	}

	public void setValido(Boolean valido) {
		this.valido = valido;
	}
	
	
}

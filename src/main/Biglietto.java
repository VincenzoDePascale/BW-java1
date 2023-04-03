package main;

import java.time.LocalDate;

public class Biglietto extends Titolo{
	
	private Boolean vidimato;
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

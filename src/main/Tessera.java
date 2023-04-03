package main;

import java.time.LocalDate;

public class Tessera {

	private Long id;
	private Long numero_tessera;
	private LocalDate data_scadenza;
	
	
	public Tessera() {}


	public Tessera(Long id, Long numero_tessera, LocalDate data_scadenza) {
		super();
		this.id = id;
		this.numero_tessera = numero_tessera;
		this.data_scadenza = data_scadenza;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getNumero_tessera() {
		return numero_tessera;
	}


	public void setNumero_tessera(Long numero_tessera) {
		this.numero_tessera = numero_tessera;
	}


	public LocalDate getData_scadenza() {
		return data_scadenza;
	}


	public void setData_scadenza(LocalDate data_scadenza) {
		this.data_scadenza = data_scadenza;
	}


	@Override
	public String toString() {
		return "Tessera [id=" + id + ", numero_tessera=" + numero_tessera + ", data_scadenza=" + data_scadenza + "]";
	}
	
	
	
	
}

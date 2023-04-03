package main;

import java.time.LocalDate;

public class Titolo {
	
	private Long id;
	private Long numero;
	private LocalDate data_emissione;
	
	
	public Titolo () {};
	
	
	
	public Titolo(Long id, Long numero, LocalDate data_emissione) {
		super();
		this.id = id;
		this.numero = numero;
		this.data_emissione = data_emissione;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public LocalDate getData_emissione() {
		return data_emissione;
	}
	public void setData_emissione(LocalDate data_emissione) {
		this.data_emissione = data_emissione;
	}

	@Override
	public String toString() {
		return "Titolo [id=" + id + ", numero=" + numero + ", data_emissione=" + data_emissione + "]";
	}
		

}

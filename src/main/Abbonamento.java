package main;

import java.time.LocalDate;

public class Abbonamento extends Titolo {
	
	private LocalDate data_inizio;
	private LocalDate data_scadenza;
	private TipoAbbonamento durata;
	
	public Abbonamento() {}

	

	public Abbonamento(Long id, Long numero, LocalDate data_emissione, LocalDate data_inizio, LocalDate data_scadenza,
			TipoAbbonamento durata) {
		super(id, numero, data_emissione);
		this.data_inizio = data_inizio;
		this.data_scadenza = data_scadenza;
		this.durata = durata;
	}



	public LocalDate getData_inizio() {
		return data_inizio;
	}

	public void setData_inizio(LocalDate data_inizio) {
		this.data_inizio = data_inizio;
	}

	public LocalDate getData_scadenza() {
		return data_scadenza;
	}

	public void setData_scadenza(LocalDate data_scadenza) {
		this.data_scadenza = data_scadenza;
	}

	public TipoAbbonamento getDurata() {
		return durata;
	}

	public void setDurata(TipoAbbonamento durata) {
		this.durata = durata;
	}

	@Override
	public String toString() {
		return "Abbonamento [data_inizio=" + data_inizio + ", data_scadenza=" + data_scadenza + ", durata=" + durata
				+ "]";
	};
	
	
}

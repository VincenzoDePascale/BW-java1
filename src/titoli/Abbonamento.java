package titoli;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
public class Abbonamento extends Titolo {
	
	@Column
	private LocalDate data_inizio;
	
	@Column
	private LocalDate data_scadenza;
	
	@Enumerated(EnumType.STRING)
	@Column
	private TipoAbbonamento durata;
	
	public Abbonamento() {}

	public Abbonamento(LocalDate data_emissione, LocalDate data_inizio, TipoAbbonamento durata) {
		super(data_emissione);
		this.data_inizio = data_inizio;
		this.durata = durata;
	}



	public LocalDate getData_inizio() {
		return data_inizio;
	}

	public void setData_inizio(LocalDate data_inizio) {
		this.data_inizio = data_inizio;
		if(this.durata == TipoAbbonamento.SETTIMANALE) {
			this.data_scadenza = data_inizio.plusDays(7);
		} else if (this.durata == TipoAbbonamento.MENSILE) {
			this.data_scadenza = data_inizio.plusDays(30);
		}
		
	}

	public LocalDate getData_scadenza() {
		return data_scadenza;
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

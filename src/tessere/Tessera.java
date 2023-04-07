package tessere;

import java.time.LocalDate;

import javax.persistence.*;

import titoli.Abbonamento;
import utenti.Utente;

@Entity
@Table(name = "tessere")
@NamedQuery(name="tessere.findAll", query = "SELECT t FROM Tessera t")
@NamedQuery(name="findTesseraById", query = "SELECT t FROM Tessera t WHERE numero_tessera = :id")
@SequenceGenerator(name= "tessera_sequence", sequenceName = "tessera_sequence", initialValue = 1000, allocationSize = 0)
public class Tessera {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tessera_sequence")
	@Column(name = "numero_tessera")
	private Long id;
	
	@OneToOne(mappedBy= "tessera")
	private Utente utenti;
	
	@OneToOne(mappedBy= "tessera")
	private Abbonamento abbonamento;
	
	@Column(nullable = false)
	private LocalDate data_creazione;
	
	@Column(nullable = false)
	private LocalDate data_scadenza;
	
	
	public Tessera() {}


	public Tessera(LocalDate data_creazione) {
		super();
		this.data_creazione = data_creazione;
		this.data_scadenza = data_creazione.plusYears(1);
	}


	public Long getId() {
		return id;
	}


	public LocalDate getData_creazione() {
		return data_creazione;
	}


	public void setData_creazione(LocalDate data_creazione) {
		this.data_creazione = data_creazione;
		this.data_scadenza = data_creazione.plusYears(1);
	}

	public LocalDate getData_scadenza() {
		return data_scadenza;
	}

	public void setData_scadenza(LocalDate data_scadenza) {
		this.data_scadenza = data_scadenza;
	}

	@Override
	public String toString() {
		return "Tessera [getId()=" + getId() + ", getData_creazione()="
				+ getData_creazione()+ ", getData_scadenza()="
				+ getData_scadenza() + "]";
	}
	
}

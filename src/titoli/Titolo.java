package titoli;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import negozi.PuntiVendita;


@Entity
@Table(name = "titoli")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name= "tipologia_biglietto", discriminatorType = DiscriminatorType.STRING)
@NamedQuery(name="titoli.findAll", query = "SELECT t FROM Titolo t")
//@NamedQuery(name = "FindTitoliDaNegozio", query = "SELECT COUNT (*) FROM Titolo t WHERE t.punto_vendita = :id")
public abstract class Titolo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(nullable = false)
	private LocalDate data_emissione;
	
	@ManyToOne
	@JoinColumn(name= "id_puntivendita")
	private PuntiVendita punto_vendita;
		
	public Titolo () {};
	
	public Titolo(LocalDate data_emissione, PuntiVendita punto_vendita) {
		this.data_emissione = data_emissione;
		this.punto_vendita  = punto_vendita;
	}

	public Long getId() {
		return id;
	}
	
	public LocalDate getData_emissione() {
		return data_emissione;
	}
	
	public void setData_emissione(LocalDate data_emissione) {
		this.data_emissione = data_emissione;
	}

	public PuntiVendita getPunto_vendita() {
		return punto_vendita;
	}

	public void setPunto_vendita(PuntiVendita punto_vendita) {
		this.punto_vendita = punto_vendita;
	}

	@Override
	public String toString() {
		return "Titolo [getId()=" + getId() + ", getData_emissione()=" + getData_emissione() + "]";
	}

	
		

}

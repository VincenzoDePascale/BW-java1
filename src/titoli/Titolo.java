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
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "titoli")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name= "tipologia_biglietto", discriminatorType = DiscriminatorType.STRING)
@NamedQuery(name="titoli.findAll", query = "SELECT t FROM Titolo t")
public abstract class Titolo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(nullable = false)
	private LocalDate data_emissione;
		
	public Titolo () {};
	
	public Titolo(LocalDate data_emissione) {
		this.data_emissione = data_emissione;
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

	@Override
	public String toString() {
		return "Titolo [id=" + id + ", data_emissione=" + data_emissione + "]";
	}
		

}

package negozi;

import java.util.List;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import titoli.Titolo;

@Entity
@Table(name= "PuntiVendita")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name= "tipologia_puntovendita", discriminatorType = DiscriminatorType.STRING)
@NamedQuery(name="PuntiVendita.findAll", query = "SELECT p FROM PuntiVendita p")
public abstract class PuntiVendita  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@OneToMany(mappedBy= "punto_vendita")
	private List<Titolo> titoli;
	
	@Column
	private Long biglietti_emessi;
	
	@Column
	private Long abbonamenti_emessi;
	
	
	public PuntiVendita () {}


	public PuntiVendita(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Long getBiglietti_emessi() {
		return biglietti_emessi;
	}


	public void setBiglietti_emessi(Long biglietti_emessi) {
		this.biglietti_emessi = biglietti_emessi;
	}


	public Long getAbbonamenti_emessi() {
		return abbonamenti_emessi;
	}


	public void setAbbonamenti_emessi(Long abbonamenti_emessi) {
		this.abbonamenti_emessi = abbonamenti_emessi;
	}

	@Override
	public String toString() {
		return "PuntiVendita [getId()=" + getId() + ", getNome()=" + getNome() + ", getBiglietti_emessi()="
				+ getBiglietti_emessi() + ", getAbbonamenti_emessi()=" + getAbbonamenti_emessi() + "]";
	}
	
}

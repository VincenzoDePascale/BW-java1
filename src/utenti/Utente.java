package utenti;

import javax.persistence.*;

import tessere.Tessera;

@Entity
@Table(name = "utenti")
@NamedQuery(name="utenti.findAll", query = "SELECT e FROM Utente e")
@NamedQuery(name="utenti.findId", query = "SELECT e FROM Utente e WHERE e.id = :id")
@NamedQuery(name="utenti.findTessera", query = "SELECT e FROM Utente e WHERE tessera_utente = :tessera")
public class Utente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@OneToOne
	@JoinColumn(name= "tessera_utente", unique= true)
	private Tessera tessera;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String cognome;
	
	public Utente () {}

	public Utente(Tessera tessera, String nome, String cognome) {
		super();
		this.tessera = tessera;
		this.nome = nome;
		this.cognome = cognome;
	}

	public Long getId() {
		return id;
	}

	public Tessera getTessera() {
		return tessera;
	}

	public void setTessera(Tessera numero_tessera) {
		this.tessera = numero_tessera;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Utente [getId()=" + getId() + ", getTessera()=" + getTessera() + ", getNome()=" + getNome()
				+ ", getCognome()=" + getCognome() + "]";
	}

	

	
	
	

}

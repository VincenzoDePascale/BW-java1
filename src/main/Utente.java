package main;

public class Utente {
	
	private Long id;
	private Tessera numero_tessera;
	private String nome;
	private String cognome;
	
	public Utente () {}

	public Utente(Long id, Tessera numero_tessera, String nome, String cognome) {
		super();
		this.id = id;
		this.numero_tessera = numero_tessera;
		this.nome = nome;
		this.cognome = cognome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Tessera getNumero_tessera() {
		return numero_tessera;
	}

	public void setNumero_tessera(Tessera numero_tessera) {
		this.numero_tessera = numero_tessera;
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
		return "Utente [id=" + id + ", numero_tessera=" + numero_tessera + ", nome=" + nome + ", cognome=" + cognome
				+ "]";
	}
	
	

}

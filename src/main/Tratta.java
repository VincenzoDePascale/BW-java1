package main;

public class Tratta {
	private Long id;
	private String nome_tratta;
	private int durata_media;
	private String partenza;
	private String capolinea;
	
	public Tratta () {}

	public Tratta(Long id, String nome_tratta, int durata_media, String partenza, String capolinea) {
		super();
		this.id = id;
		this.nome_tratta = nome_tratta;
		this.durata_media = durata_media;
		this.partenza = partenza;
		this.capolinea = capolinea;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_tratta() {
		return nome_tratta;
	}

	public void setNome_tratta(String nome_tratta) {
		this.nome_tratta = nome_tratta;
	}

	public int getDurata_media() {
		return durata_media;
	}

	public void setDurata_media(int durata_media) {
		this.durata_media = durata_media;
	}

	public String getPartenza() {
		return partenza;
	}

	public void setPartenza(String partenza) {
		this.partenza = partenza;
	}

	public String getCapolinea() {
		return capolinea;
	}

	public void setCapolinea(String capolinea) {
		this.capolinea = capolinea;
	}

	@Override
	public String toString() {
		return "Tratta [id=" + id + ", nome_tratta=" + nome_tratta + ", durata_media=" + durata_media + ", partenza="
				+ partenza + ", capolinea=" + capolinea + "]";
	}


}

package tratte;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tratte")
@NamedQuery(name="tratte.findAll", query = "SELECT t FROM Tratta t")
public class Tratta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(nullable = false)
	private String nome_tratta;
	
	@Column
	private int durata_media;
	
	@Column(nullable = false)
	private String partenza;
	
	@Column(nullable = false)
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

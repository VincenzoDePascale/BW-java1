package mezzi;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import registri.Registro_manutenzione;
import tratte.Tratta;

@Entity
@Table(name = "parco_mezzi")
@NamedQuery(name="parco_mezzi.findAll", query = "SELECT p FROM ParcoMezzi p")
@NamedQuery(name="findMezziById", query = "SELECT p FROM ParcoMezzi p WHERE p.id = :id")
public class ParcoMezzi {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TipoMezzo tipo_mezzo;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private Boolean in_servizio;
	
	@Column(nullable = false)
	private Boolean in_manutenzione;
	
	/*@Column
	private LocalDate inizio_manutenzione;
	@Column
	private LocalDate fine_manutenzione;*/
	
	@OneToMany(mappedBy = "parco_mezzi")
	private List<Registro_manutenzione> registro_manutenzione;
	
	@Column(nullable = false)
	private int capienza;
	
	@ManyToOne
	@JoinColumn(name= "id_tratta")
	private Tratta tratta;
	
	public ParcoMezzi () {}

	public ParcoMezzi(TipoMezzo tipo_mezzo, String nome, Boolean in_servizio, int capienza) {
		this.tipo_mezzo = tipo_mezzo;
		this.nome = nome;
		this.in_servizio = in_servizio;
		this.capienza = capienza;
	}

	public Long getId() {
		return id;
	}

	public TipoMezzo getTipo_mezzo() {
		return tipo_mezzo;
	}

	public void setTipo_mezzo(TipoMezzo tipo_mezzo) {
		this.tipo_mezzo = tipo_mezzo;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getIn_servizio() {
		return in_servizio;
	}

	public void setIn_servizio(Boolean in_servizio) {
		this.in_servizio = in_servizio;
		this.in_manutenzione = !in_servizio;
	}

	public Boolean getIn_manutenzione() {
		return in_manutenzione;
	}

	public void setIn_manutenzione(Boolean in_manutenzione) {
		this.in_manutenzione = in_manutenzione;
		this.in_servizio = !in_manutenzione;
	}

	public int getCapienza() {
		return capienza;
	}

	public void setCapienza(int capienza) {
		this.capienza = capienza;
	}

	public Tratta getTratta() {
		return tratta;
	}

	public void setTratta(Tratta tratta) {
		this.tratta = tratta;
	}

	@Override
	public String toString() {
		return "ParcoMezzi [id=" + id + ", tipo_mezzo=" + tipo_mezzo + ", in_servizio=" + in_servizio
				+ ", in_manutenzione=" + in_manutenzione + ", capienza=" + capienza + ", tratta=" + tratta + "]";
	}
	
	

}

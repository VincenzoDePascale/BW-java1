package mezzi;

//import java.time.LocalDate;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.NamedQuery;
//import javax.persistence.Table;
//
//import tratte.Tratta;
//
//@Entity
//@Table(name = "parco_mezzi")
//@NamedQuery(name="parco_mezzi.findAll", query = "SELECT p FROM ParcoMezzi p")
public class ParcoMezzi {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
//	private Long id;
//	
//	@Enumerated(EnumType.STRING)
//	@Column(nullable = false)
//	private TipoMezzo tipo_mezzo;
//	
//	@Column(nullable = false)
//	private String nome;
//	
//	@Column(nullable = false)
//	private Boolean in_servizio;
//	
//	@Column(nullable = false)
//	private Boolean in_manutenzione;
//	
//	@Column
//	private LocalDate inizio_manutenzione;
//	@Column
//	private LocalDate fine_manutenzione;
//	
//	@Column(nullable = false)
//	private int capienza;
//	
//	@Column
//	private Tratta tratta;
//	
//	public ParcoMezzi () {}
//
//	public ParcoMezzi(TipoMezzo tipo_mezzo, String nome, Boolean in_servizio, int capienza) {
//		this.tipo_mezzo = tipo_mezzo;
//		this.nome = nome;
//		this.in_servizio = in_servizio;
//		this.capienza = capienza;
//	}
//	
//	
//
//	public ParcoMezzi(TipoMezzo tipo_mezzo, String nome, Boolean in_servizio, LocalDate inizio_manutenzione, int capienza) {
//		this.tipo_mezzo = tipo_mezzo;
//		this.nome = nome;
//		this.in_servizio = in_servizio;
//		this.inizio_manutenzione = inizio_manutenzione;
//		this.capienza = capienza;
//
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//
//	public TipoMezzo getTipo_mezzo() {
//		return tipo_mezzo;
//	}
//
//	public void setTipo_mezzo(TipoMezzo tipo_mezzo) {
//		this.tipo_mezzo = tipo_mezzo;
//	}
//	
//
//	public String getNome() {
//		return nome;
//	}
//
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//
//	public Boolean getIn_servizio() {
//		return in_servizio;
//	}
//
//	public void setIn_servizio(Boolean in_servizio) {
//		this.in_servizio = in_servizio;
//		this.in_manutenzione = !in_servizio;
//	}
//
//	public Boolean getIn_manutenzione() {
//		return in_manutenzione;
//	}
//
//	public void setIn_manutenzione(Boolean in_manutenzione) {
//		this.in_manutenzione = in_manutenzione;
//		this.in_servizio = !in_manutenzione;
//	}
//
//	public int getCapienza() {
//		return capienza;
//	}
//
//	public void setCapienza(int capienza) {
//		this.capienza = capienza;
//	}
//
//	public Tratta getTratta() {
//		return tratta;
//	}
//
//	public void setTratta(Tratta tratta) {
//		this.tratta = tratta;
//	}
//	
//	
//
//	public LocalDate getInizio_manutenzione() {
//		return inizio_manutenzione;
//	}
//
//	public void setInizio_manutenzione(LocalDate inizio_manutenzione) {
//		this.inizio_manutenzione = inizio_manutenzione;
//	}
//
//	public LocalDate getFine_manutenzione() {
//		return fine_manutenzione;
//	}
//
//	public void setFine_manutenzione(LocalDate fine_manutenzione) {
//		this.fine_manutenzione = fine_manutenzione;
//	}
//
//	@Override
//	public String toString() {
//		return "ParcoMezzi [id=" + id + ", tipo_mezzo=" + tipo_mezzo + ", in_servizio=" + in_servizio
//				+ ", in_manutenzione=" + in_manutenzione + ", capienza=" + capienza + ", tratta=" + tratta + "]";
//	}
//	
//	

}

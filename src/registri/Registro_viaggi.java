package registri;

import java.time.LocalTime;

import javax.persistence.*;

import mezzi.ParcoMezzi;
import tratte.Tratta;

@Entity
@Table(name = "registri_viaggi")
public class Registro_viaggi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column
	private String nome;
	
	@Column
	private LocalTime init_viaggio;
	
	@Column
	private LocalTime fine_viaggio;
	
	@ManyToOne
	@JoinColumn(name = "id_tratta")
	private Tratta tratta;
	
	@ManyToOne
	@JoinColumn(name = "id_parco_mezzi")
	private ParcoMezzi parco_mezzi;
	
	public Registro_viaggi() {}

	public Registro_viaggi(long id, String nome, LocalTime init_viaggio, LocalTime fine_viaggio, Tratta tratta) {
		super();
		this.id = id;
		this.nome = nome;
		this.init_viaggio = init_viaggio;
		this.fine_viaggio = fine_viaggio;
		this.tratta = tratta;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalTime getInit_viaggio() {
		return init_viaggio;
	}

	public void setInit_viaggio(LocalTime init_viaggio) {
		this.init_viaggio = init_viaggio;
	}

	public LocalTime getFine_viaggio() {
		return fine_viaggio;
	}

	public void setFine_viaggio(LocalTime fine_viaggio) {
		this.fine_viaggio = fine_viaggio;
	}

	public Tratta getTratta() {
		return tratta;
	}

	public void setTratta(Tratta tratta) {
		this.tratta = tratta;
	}
	

	public ParcoMezzi getParco_mezzi() {
		return parco_mezzi;
	}

	public void setParco_mezzi(ParcoMezzi parco_mezzi) {
		this.parco_mezzi = parco_mezzi;
	}

	@Override
	public String toString() {
		return "Registro_viaggi [id=" + id + ", nome=" + nome + ", init_viaggio=" + init_viaggio + ", fine_viaggio="
				+ fine_viaggio + ", tratta=" + tratta + "]";
	}

	
	
		
	
}

package registri;

import java.time.LocalDate;
import javax.persistence.*;
import mezzi.ParcoMezzi;

@Entity
@Table(name = "registri_manutenzione")
public class Registro_manutenzione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	@Column
	private String nome;
	
	@Column
	private LocalDate init_manutenzione;
	
	@Column
	private LocalDate fine_manutenzione;
	
	@ManyToOne
	@JoinColumn(name = "id_parco_mezzi")
	private ParcoMezzi parco_mezzi;

public Registro_manutenzione () {}

public Registro_manutenzione(long id, String nome, LocalDate init_manutenzione, LocalDate fine_manutenzione,
		ParcoMezzi parco_mezzi) {
	super();
	this.id = id;
	this.nome = nome;
	this.init_manutenzione = init_manutenzione;
	this.fine_manutenzione = fine_manutenzione;
	this.parco_mezzi = parco_mezzi;
}

public long getId() {
	return id;
}


public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public LocalDate getInit_manutenzione() {
	return init_manutenzione;
}

public void setInit_manutenzione(LocalDate init_manutenzione) {
	this.init_manutenzione = init_manutenzione;
}

public LocalDate getFine_manutenzione() {
	return fine_manutenzione;
}

public void setFine_manutenzione(LocalDate fine_manutenzione) {
	this.fine_manutenzione = fine_manutenzione;
}

public ParcoMezzi getParco_mezzi() {
	return parco_mezzi;
}

public void setParco_mezzi(ParcoMezzi parco_mezzi) {
	this.parco_mezzi = parco_mezzi;
}

@Override
public String toString() {
	return "Registro_manutenzione [id=" + id + ", nome=" + nome + ", init_manutenzione=" + init_manutenzione
			+ ", fine_manutenzione=" + fine_manutenzione + ", parco_mezzi=" + parco_mezzi + "]";
}



}

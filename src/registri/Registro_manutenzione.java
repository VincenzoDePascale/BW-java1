package registri;

import java.time.LocalDate;
import javax.persistence.*;
import mezzi.ParcoMezzi;

@Entity
@Table(name = "registri_viaggi")
public class Registro_manutenzione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	@Column
	private LocalDate init_manutenzione;
	
	@Column
	private LocalDate fine_manutenzione;
	
	@ManyToOne
	@JoinColumn(name = "id_parco_mezzi")
	private ParcoMezzi parco_mezzi;

public Registro_manutenzione () {}

public Registro_manutenzione(LocalDate init_manutenzione, LocalDate fine_manutenzione) {
	super();
	this.init_manutenzione = init_manutenzione;
	this.fine_manutenzione = fine_manutenzione;
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

@Override
public String toString() {
	return "Registro_manutenzione [init_manutenzione=" + init_manutenzione + ", fine_manutenzione=" + fine_manutenzione + "]";
}



}

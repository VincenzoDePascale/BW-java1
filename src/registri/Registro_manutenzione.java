package registri;

import java.time.LocalDate;

import javax.persistence.*;

import mezzi.ParcoMezzi;

@Entity
@Table(name = "registri")
public class Registro_manutenzione extends Registro{

	@Column
	private LocalDate init_manutenzione;
	
	@Column
	private LocalDate fine_manutenzione;
	
	@Column
	private long n_manutenzioni;

public Registro_manutenzione () {}

public Registro_manutenzione(ParcoMezzi mezzo, LocalDate init_manutenzione, LocalDate fine_manutenzione, long n_manutenzioni) {
	super(mezzo);
	this.init_manutenzione = init_manutenzione;
	this.fine_manutenzione = fine_manutenzione;
	this.n_manutenzioni = n_manutenzioni;
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

public long getN_manutenzioni() {
	return n_manutenzioni;
}

public void setN_manutenzioni(long n_manutenzioni) {
	this.n_manutenzioni = n_manutenzioni;
}

@Override
public String toString() {
	return "Registro_manutenzione [init_manutenzione=" + init_manutenzione + ", fine_manutenzione=" + fine_manutenzione
			+ ", n_manutenzioni=" + n_manutenzioni + "]";
}



}

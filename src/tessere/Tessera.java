package tessere;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "tessere")
@NamedQuery(name="tessere.findAll", query = "SELECT t FROM Tessera t")
public class Tessera {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	/*@OneToOne(mappedBy= "numero_tessera")*/
	@Column
	private Long numero_tessera;
	
	@Column(nullable = false)
	private LocalDate data_scadenza;
	
	
	public Tessera() {}


	public Tessera(Long numero_tessera, LocalDate data_scadenza) {
		super();
		this.numero_tessera = numero_tessera;
		this.data_scadenza = data_scadenza;
	}


	public Long getId() {
		return id;
	}




	public Long getNumero_tessera() {
		return numero_tessera;
	}


	public void setNumero_tessera(Long numero_tessera) {
		this.numero_tessera = numero_tessera;
	}


	public LocalDate getData_scadenza() {
		return data_scadenza;
	}


	public void setData_scadenza(LocalDate data_scadenza) {
		this.data_scadenza = data_scadenza;
	}


	@Override
	public String toString() {
		return "Tessera [id=" + id + ", numero_tessera=" + numero_tessera + ", data_scadenza=" + data_scadenza + "]";
	}
	
	
	
	
}

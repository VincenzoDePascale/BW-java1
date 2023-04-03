package main;

public class ParcoMezzi {
	private Long id;
	private TipoMezzo tipo_mezzo;
	private Boolean in_servizio;
	private Boolean in_manutenzione;
	private int capienza;
	private Tratta tratta;
	
	public ParcoMezzi () {}

	public ParcoMezzi(Long id, TipoMezzo tipo_mezzo, Boolean in_servizio, Boolean in_manutenzione, int capienza,
			Tratta tratta) {
		super();
		this.id = id;
		this.tipo_mezzo = tipo_mezzo;
		this.in_servizio = in_servizio;
		this.in_manutenzione = in_manutenzione;
		this.capienza = capienza;
		this.tratta = tratta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoMezzo getTipo_mezzo() {
		return tipo_mezzo;
	}

	public void setTipo_mezzo(TipoMezzo tipo_mezzo) {
		this.tipo_mezzo = tipo_mezzo;
	}

	public Boolean getIn_servizio() {
		return in_servizio;
	}

	public void setIn_servizio(Boolean in_servizio) {
		this.in_servizio = in_servizio;
	}

	public Boolean getIn_manutenzione() {
		return in_manutenzione;
	}

	public void setIn_manutenzione(Boolean in_manutenzione) {
		this.in_manutenzione = in_manutenzione;
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

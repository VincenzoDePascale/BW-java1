package negozi;

public class Distributore extends PuntiVendita {
	private Boolean attivo;
	
	public Distributore () {}
	
	

	
	public Distributore( String nome, Long biglietti_emessi, Long abbonamenti_emessi, Boolean attivo) {
		super(nome, biglietti_emessi, abbonamenti_emessi);
		this.attivo = attivo;
	}


	public Boolean getAttivo() {
		return attivo;
	}

	public void setAttivo(Boolean attivo) {
		this.attivo = attivo;
	}


	@Override
	public String toString() {
		return "Distributore [attivo=" + attivo + "]";
	}
	
	
	

}

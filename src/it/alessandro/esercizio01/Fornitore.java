package it.alessandro.esercizio01;

public class Fornitore {
	private long codiceFornitore;
	private String nome;
	private String indirizzo;
	private String citta;

	public Fornitore(long codiceFornitore, String nome, String indirizzo, String citta) {
		this.codiceFornitore = codiceFornitore;
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.citta = citta;
	}
	
	public Fornitore() {
		
	}

	public long getCodiceFornitore() {
		return codiceFornitore;
	}

	public String getNome() {
		return nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public String getCitta() {
		return citta;
	}

	@Override
	public String toString() {
		return " [codiceFornitore=" + codiceFornitore + ", nome=" + nome + ", indirizzo=" + indirizzo
				+ ", citta=" + citta + "]";
	}
	
	
}

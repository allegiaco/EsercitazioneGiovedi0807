package it.alessandro.esercizio01;

public class Prodotto {
	private long codiceProdotto;
	private String nome;
	private String descrizione;
	private String marca;
	private double prezzo;
	private Fornitore forn;

	public Prodotto(long codiceProdotto, String nome, String descrizione, String marca, double prezzo, Fornitore forn) {
		this.codiceProdotto = codiceProdotto;
		this.nome = nome;
		this.descrizione = descrizione;
		this.marca = marca;
		this.prezzo = prezzo;
		this.forn = forn;
	}

	public Fornitore getForn() {
		return forn;
	}

	public long getCodiceProdotto() {
		return codiceProdotto;
	}

	public String getNome() {
		return nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public String getMarca() {
		return marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

}

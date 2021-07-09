package it.alessandro.esercizio01;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Start {

	public static Map<Fornitore, List<Prodotto>> prodottiPerFornitore = new HashMap<Fornitore, List<Prodotto>>();

	public static void main(String[] args) {
		
//		List<Animale> ra = new ArrayList<Animale>();
//		
//		Animale a1 = new Gatto();
//		Animale a2 = new Gatto();
//		ciao
//		ra.add(a1);
//		ra.add(a2);
		
//		for (Animale x : ra) {
//			x.mangia();
//		}
//		ConnectionHandler connection = new ConnectionHandler("localhost", "esercitazione4", "negozio", "postgres",
//				"epicode");
//		ProdottoDAO gestProd = new ProdottoDAO(connection);
//		FornitoreDAO gestForn = new FornitoreDAO(connection);

//		Fornitore fornitore1 = new Fornitore(123456, "Ciccio", "via Alba", "Milano");
//		Fornitore fornitore2 = new Fornitore(426879, "Pippo", "via Era", "Napoli");
//		Prodotto prodotto1 = new Prodotto(475324, "Pasta", "kdjfvhadjh", "Barilla", 4.35, fornitore1);
//		Prodotto prodotto2 = new Prodotto(795842, "Pomodori", "vlkj", "Mutti", 2.37, fornitore1);
//		Prodotto prodotto3 = new Prodotto(746598, "Motorino", "pportuhw", "Piaggio", 1464.39, fornitore2);
//
//		Map<Long, Fornitore> mapFornitori = new HashMap<>();
//		mapFornitori.put(fornitore1.getCodiceFornitore(), fornitore1);
//		mapFornitori.put(fornitore2.getCodiceFornitore(), fornitore2);
//
//		Fornitore n = mapFornitori.get(123456);
//
//		aggiungiProdotto(prodotto1);
//		aggiungiProdotto(prodotto2);
//		aggiungiProdotto(prodotto3);

		String frase = "Per terminare con successo il corso Java bisogna studiare notte e giorno. Il"
				+ " giorno si studia e la notte si fa esercizio. Alla fine del corso a forza di Java"
				+ " saremo buoni programmatori Java";

		String ripetutaMaggiormente = findWordMode(frase);
		System.out.println(ripetutaMaggiormente);
	}

	public static int aggiungiProdotto(Prodotto p) {
		List<Prodotto> lp = prodottiPerFornitore.get(p.getForn());
		if (lp == null) {
			lp = new ArrayList<Prodotto>();
			prodottiPerFornitore.put(p.getForn(), lp);
		}
		lp.add(p);
		return lp.size();
		// return prodottiPerFornitore.get(p.getForn()).size(); sarebbe corretto lo
		// stesso
	}

	public static String findWordMode(String frase) {
		String[] singoleParole = frase.split(" ");
		Map<String, Integer> map = new HashMap<>();
//		int c = 0;
		int max = 0;
//		String parola = null;

		Map.Entry<String, Integer> maxEntry = null;

		for (String f : singoleParole) {
			Integer frequenza = map.get(f); // gli Integer NON sono modificabili !!!
			if (frequenza == null) {
				map.put(f, 1);
			} else {
				frequenza++;
				// frequenza = new Integer (frequenza.intValue() + 1); //linea 67 e 68 fanno la
				// stessa cosa !!!
				map.put(f, frequenza);
			}
		}
		
//		for (Animale x : ra) {
//			x.mangia();
//		}
		
		for (Map.Entry<String, Integer> freq : map.entrySet()) {
			if (freq.getValue() > max) {
				maxEntry = freq;
				max = freq.getValue();
			}

		}
		System.out.println(maxEntry.getClass().getName());
		
		List<String> pippo = new ArrayList<>();
		for(String s: pippo) {
			System.out.println(s);
		}
		
		for(Iterator<String> it = pippo.iterator(); it.hasNext();) {
			String s = it.next();
			System.out.println(s);
		}
		
		return map.entrySet().stream().max((kv1, kv2) -> kv1.getValue() - kv2.getValue()).get().getKey();
		
		
//		return maxEntry.getKey();

//		for (String f : singoleParole) {
//			for (String g : singoleParole) {
//				if (g.equals(f)) {
//					c++;
//				}
//
//			}
//			map.put(f, c);
//		}
//		for (Map.Entry<String, Integer> freq : map.entrySet()) {
//			int k = fgh.getValue();
//			if (k > max) {
//				max = k;
//			}
	}

//		for (Map.Entry<String, Integer> entry : map.entrySet()) {
//			if (max == entry.getValue()) {
//				parola = entry.getKey();
//			}
//		}
//		return parola;
//
//	}
}

//interface Animale {
//
//	void getValue() {
//	};
//	void getKey();
//}
//
//
//class Gatto implements Animale {
//
//	@Override
//	public void mangia() {
//		System.out.println("gnam gnam");
//		
//	}
//	

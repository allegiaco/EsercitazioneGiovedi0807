package it.alessandro.esercizio01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdottoDAO {
	private ConnectionHandler connHan;

	public ProdottoDAO(ConnectionHandler connHan) {
		this.connHan = connHan;
	}

	public static final String QUERY_PRODOTTO_PER_FORNITORE = "SELECT f.nome, codice_prodotto, p.nome as prodNome, p.descrizione, p.marca, p.prezzo FROM negozio.prodotto p "
			+ "INNER JOIN negozio.fornitore f on p.fk_fornitore = f.codice_fornitore WHERE f.codice_fornitore = ?";

	public List<Prodotto> getProdottoPerFornitore(Fornitore forn) throws SQLException {
		List<Prodotto> results = new ArrayList<Prodotto>();
		try (Connection con = connHan.getConnection();
				PreparedStatement ps = connHan.getPreparedStatement(QUERY_PRODOTTO_PER_FORNITORE)) {
			ps.setLong(1, forn.getCodiceFornitore());
			try (ResultSet rs = ps.executeQuery();) {
				while (rs.next()) {
					results.add(new Prodotto(rs.getLong("codice_prodotto"), rs.getString("prodNome"),
							rs.getString("descrizione"), rs.getString("marca"), rs.getDouble("prezzo"), forn));
				}
				return results;
			}
		}
	}
}

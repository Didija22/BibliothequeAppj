package dao;

import models.Caisse;
import java.sql.*;

public class CaisseDAO {
    private Connection conn;

    public CaisseDAO(Connection conn) { this.conn = conn; }

    public void sauvegarderSolde(Caisse c) throws SQLException {
        String sql = "UPDATE caisse SET solde = ? WHERE id = 1";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDouble(1, c.getSolde());
            ps.executeUpdate();
        }
    }
}
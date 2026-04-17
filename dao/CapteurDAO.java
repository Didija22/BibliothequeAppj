package dao;

import models.Capteur;
import java.sql.*;

public class CapteurDAO {
    private Connection conn;

    public CapteurDAO(Connection conn) { this.conn = conn; }

    public void logValeur(Capteur cap) throws SQLException {
        String sql = "UPDATE capteur SET valeur_actuelle = ? WHERE id_capteur = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDouble(1, cap.getValeurActuelle());
            ps.setInt(2, cap.getIdCapteur());
            ps.executeUpdate();
        }
    }
}
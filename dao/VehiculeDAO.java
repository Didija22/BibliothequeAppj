package dao;

import models.Vehicule;
import java.sql.*;

public class VehiculeDAO {
    private Connection conn;

    public VehiculeDAO(Connection conn) { this.conn = conn; }

    public void updateStatut(Vehicule v) throws SQLException {
        String sql = "UPDATE vehicule SET statut = ?, kilometrage = ? WHERE id_vehicule = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, v.getStatut());
            ps.setInt(2, v.getKilometrage());
            ps.setString(3, v.getIdVehicule());
            ps.executeUpdate();
        }
    }
}
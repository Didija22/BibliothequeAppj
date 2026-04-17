import models.*;
import dao.*;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Simulation du Systeme de Bibliotheque ===");

        // 1. Test de la Caisse
        Caisse maCaisse = new Caisse(1000.0);
        maCaisse.encaisserAmende(15.50);
        System.out.println("Caisse : " + maCaisse.getSolde() + "€");

        // 2. Test du Vehicule
        Vehicule v = new Vehicule("V-001", "Disponible", 10000);
        v.setStatut("En livraison");
        System.out.println("Vehicule : " + v.getIdVehicule() + " est " + v.getStatut());

        // 3. Test du Capteur
        Capteur c = new Capteur(1, "Temperature", 25.0);
        c.setValeurActuelle(28.5);
        if(c.alerteDeclenchee()) {
            System.out.println("ALERTE : Temperature trop elevee pour la conservation !");
        }

        // --- PARTIE BASE DE DONNEES (A l'interieur du main !) ---
        try (Connection conn = DBConnection.getConnection()) {
            CaisseDAO caisseDAO = new CaisseDAO(conn);
            caisseDAO.sauvegarderSolde(maCaisse);
            System.out.println("Donnees sauvegardees en base avec succes !");
        } catch (Exception e) {
            System.out.println("Note : Base de donnees non connectee, mais la logique fonctionne.");
        }

    } // <--- CETTE ACCOLADE FERME LE MAIN (elle doit etre ici)
} // <--- CETTE ACCOLADE FERME LA CLASSE
public class Main {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("  BIBLIOTHEQUE MUNICIPALE");
        System.out.println("=================================\n");

        // ── 1. Créer des livres
        System.out.println("── 1. AJOUT DES LIVRES ──");
        Livre l1 = new Livre("978-2-07-036024-5",
                "Le Petit Prince",
                "Antoine de Saint-Exupéry",
                1943, "Roman");
        Livre l2 = new Livre("978-2-07-040850-4",
                "L'Etranger",
                "Albert Camus",
                1942, "Roman");
        System.out.println(l1);
        System.out.println(l2);

        // ── 2. Créer des exemplaires
        System.out.println("\n── 2. AJOUT DES EXEMPLAIRES ──");
        Exemplaire e1 = new Exemplaire(1, l1);
        Exemplaire e2 = new Exemplaire(2, l1);
        Exemplaire e3 = new Exemplaire(3, l2);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // ── 3. Créer des membres
        System.out.println("\n── 3. AJOUT DES MEMBRES ──");
        Membre m1 = new Membre(1, "Diallo", "Mamadou",
                "mamadou@gmail.com");
        Membre m2 = new Membre(2, "Ndiaye", "Fatou",
                "fatou@gmail.com");
        System.out.println(m1);
        System.out.println(m2);

        // ── 4. Emprunts
        System.out.println("\n── 4. EMPRUNTS ──");
        Emprunt emp1 = new Emprunt(1, m1, e1);
        Emprunt emp2 = new Emprunt(2, m2, e3);
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println("Statut e1 : " + e1);
        System.out.println("Statut e3 : " + e3);

        // ── 5. Retour d'un livre
        System.out.println("\n── 5. RETOUR ──");
        emp1.retourner();
        System.out.println("Statut e1 après retour : " + e1);

        // ── 6. Caisse
        System.out.println("\n── 6. CAISSE ──");
        Caisse caisse = new Caisse(0);
        m1.ajouterAmende(500);
        System.out.println("Amende de " + m1.getPrenom()
                + " : " + m1.getAmendeTotal() + " F");
        caisse.encaisser(m1, 500);
        System.out.println(caisse);

        // ── 7. Véhicule
        System.out.println("\n── 7. VEHICULE ──");
        Vehicule v = new Vehicule("DK-1234-AB", "Renault Trafic");
        System.out.println(v);
        v.demarrerLivraison("Annexe Plateau");
        System.out.println(v);
        v.terminerLivraison();
        System.out.println(v);

        // ── 8. Capteur
        System.out.println("\n── 8. CAPTEURS ──");
        Capteur c = new Capteur(1, "Salle principale");
        System.out.println(c);
        c.setTemperature(22.0);
        c.setHumidite(55.0);
        c.setTemperature(30.0); // alerte !
        c.setHumidite(80.0);    // alerte !

        System.out.println("\n=================================");
        System.out.println("  FIN DU SCENARIO");
        System.out.println("=================================");
    }
}
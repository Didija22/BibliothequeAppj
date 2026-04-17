public class Caisse {

    // ── Attributs
    private double solde;

    // ── Constructeur sans paramètre
    public Caisse() {
        this.solde = 0.0;
    }

    // ── Constructeur avec paramètres
    public Caisse(double soldeInitial) {
        if (soldeInitial >= 0) this.solde = soldeInitial;
        else System.out.println("Solde invalide !");
    }

    // ── Getter
    public double getSolde() { return solde; }

    // ── Setter
    public void setSolde(double solde) {
        if (solde >= 0) this.solde = solde;
        else System.out.println("Solde invalide !");
    }

    // ── Encaisser une amende
    public void encaisser(Membre membre, double montant) {
        if (montant <= 0) {
            System.out.println("Montant invalide !");
            return;
        }
        if (montant > membre.getAmendeTotal()) {
            System.out.println("Montant supérieur à l'amende !");
            return;
        }
        membre.payerAmende(montant);
        this.solde += montant;
        System.out.println("Caisse : +" + montant
                + " F | Solde total : " + solde + " F");
    }

    // ── toString
    @Override
    public String toString() {
        return "Caisse | Solde : " + solde + " F";
    }
}
package models;

public class Caisse {
    private double solde;

    public Caisse(double soldeInitial) {
        if (soldeInitial < 0) throw new IllegalArgumentException("Solde invalide");
        this.solde = soldeInitial;
    }

    public double getSolde() { return solde; }

    public void encaisserAmende(double montant) {
        if (montant > 0) {
            this.solde += montant;
        } else {
            System.out.println("Erreur : Montant amende incohérent");
        }
    }
}
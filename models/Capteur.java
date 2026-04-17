package models;

public class Capteur {
    private int idCapteur;
    private String type; 
    private double valeurActuelle;
    private double seuilAlerte;

    public Capteur(int id, String type, double seuil) {
        this.idCapteur = id;
        this.type = type;
        this.seuilAlerte = seuil;
    }

    public boolean alerteDeclenchee() {
        return valeurActuelle > seuilAlerte;
    }

    public int getIdCapteur() { return idCapteur; }
    public double getValeurActuelle() { return valeurActuelle; }
    public void setValeurActuelle(double v) { this.valeurActuelle = v; }
}
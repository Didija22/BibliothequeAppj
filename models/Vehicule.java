package models;

public class Vehicule {
    private String idVehicule;
    private String statut; 
    private int kilometrage;

    public Vehicule(String id, String statut, int km) {
        this.idVehicule = id;
        this.statut = statut;
        this.kilometrage = km;
    }

    public String getIdVehicule() { return idVehicule; }
    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }
    public int getKilometrage() { return kilometrage; }
    public void ajouterKM(int km) { if(km > 0) this.kilometrage += km; }
}
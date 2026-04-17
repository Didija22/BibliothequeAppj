public class Membre {

    // ── Attributs
    private int    idMembre;
    private String nom;
    private String prenom;
    private String email;
    private double amendeTotal;

    // ── Constructeur sans paramètre
    public Membre() {
        this.idMembre    = 0;
        this.nom         = "";
        this.prenom      = "";
        this.email       = "";
        this.amendeTotal = 0.0;
    }

    // ── Constructeur avec paramètres
    public Membre(int idMembre, String nom,
                  String prenom, String email) {
        this.idMembre    = idMembre;
        this.nom         = nom;
        this.prenom      = prenom;
        this.email       = email;
        this.amendeTotal = 0.0;
    }

    // ── Getters
    public int    getIdMembre()    { return idMembre; }
    public String getNom()         { return nom; }
    public String getPrenom()      { return prenom; }
    public String getEmail()       { return email; }
    public double getAmendeTotal() { return amendeTotal; }

    // ── Setters
    public void setIdMembre(int id)         { this.idMembre = id; }
    public void setNom(String nom)          { this.nom = nom; }
    public void setPrenom(String prenom)    { this.prenom = prenom; }
    public void setEmail(String email)      { this.email = email; }
    public void setAmendeTotal(double m) {
        if (m >= 0) this.amendeTotal = m;
        else System.out.println("Montant invalide !");
    }

    // ── Ajouter une amende
    public void ajouterAmende(double montant) {
        if (montant > 0) this.amendeTotal += montant;
    }

    // ── Payer une amende
    public void payerAmende(double montant) {
        if (montant <= 0) {
            System.out.println("Montant invalide !");
        } else if (montant > amendeTotal) {
            System.out.println("Montant supérieur à l'amende !");
        } else {
            this.amendeTotal -= montant;
            System.out.println("Paiement de " + montant
                    + " F. Reste : " + amendeTotal + " F");
        }
    }

    // ── toString
    @Override
    public String toString() {
        return "[" + idMembre + "] "
                + prenom + " " + nom
                + " | Email : "  + email
                + " | Amende : " + amendeTotal + " F";
    }
}
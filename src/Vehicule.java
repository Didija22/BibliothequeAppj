public class Vehicule {

    // ── Attributs
    private String  immatriculation;
    private String  modele;
    private boolean enLivraison;

    // ── Constructeur sans paramètre
    public Vehicule() {
        this.immatriculation = "";
        this.modele          = "";
        this.enLivraison     = false;
    }

    // ── Constructeur avec paramètres
    public Vehicule(String immatriculation, String modele) {
        this.immatriculation = immatriculation;
        this.modele          = modele;
        this.enLivraison     = false;
    }

    // ── Getters
    public String  getImmatriculation() { return immatriculation; }
    public String  getModele()          { return modele; }
    public boolean isEnLivraison()      { return enLivraison; }

    // ── Setters
    public void setImmatriculation(String im) {
        this.immatriculation = im;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }

    // ── Démarrer une livraison
    public void demarrerLivraison(String destination) {
        if (enLivraison) {
            System.out.println("Véhicule déjà en livraison !");
            return;
        }
        this.enLivraison = true;
        System.out.println(modele + " en route vers "
                + destination);
    }

    // ── Terminer une livraison
    public void terminerLivraison() {
        if (!enLivraison) {
            System.out.println("Aucune livraison en cours !");
            return;
        }
        this.enLivraison = false;
        System.out.println("Livraison terminée. "
                + modele + " disponible.");
    }

    // ── toString
    @Override
    public String toString() {
        return modele + " [" + immatriculation + "]"
                + " | " + (enLivraison ? "En livraison"
                : "Disponible");
    }
}
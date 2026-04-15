public class Exemplaire {

    // ── Attributs
    private int     idExemplaire;
    private Livre   livre;       // un exemplaire appartient à un livre
    private boolean disponible; // true = disponible, false = emprunté

    // ── Constructeur sans paramètre
    public Exemplaire() {
        this.idExemplaire = 0;
        this.livre        = new Livre();
        this.disponible   = true;
    }

    // ── Constructeur avec paramètres
    public Exemplaire(int idExemplaire, Livre livre) {
        this.idExemplaire = idExemplaire;
        this.livre        = livre;
        this.disponible   = true; // disponible par défaut
    }

    // ── Getters
    public int     getIdExemplaire() { return idExemplaire; }
    public Livre   getLivre()        { return livre; }
    public boolean isDisponible()    { return disponible; }

    // ── Setters
    public void setIdExemplaire(int id)      { this.idExemplaire = id; }
    public void setLivre(Livre livre)        { this.livre = livre; }
    public void setDisponible(boolean dispo) { this.disponible = dispo; }

    // ── toString
    @Override
    public String toString() {
        return "Exemplaire #" + idExemplaire
                + " | Titre : "  + livre.getTitre()
                + " | Auteur : " + livre.getAuteur()
                + " | Statut : " + (disponible ? "✅ Disponible"
                : "❌ Emprunté");
    }
}
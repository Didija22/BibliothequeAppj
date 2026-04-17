import java.time.LocalDate;

public class Emprunt {

    // ── Attributs
    private int        idEmprunt;
    private Membre     membre;
    private Exemplaire exemplaire;
    private LocalDate  dateEmprunt;
    private LocalDate  dateRetourPrevue;
    private LocalDate  dateRetourReelle;
    private boolean    rendu;

    // Amende par jour de retard
    private static final double AMENDE_PAR_JOUR = 100.0;

    // ── Constructeur sans paramètre
    public Emprunt() {
        this.idEmprunt        = 0;
        this.membre           = new Membre();
        this.exemplaire       = new Exemplaire();
        this.dateEmprunt      = LocalDate.now();
        this.dateRetourPrevue = LocalDate.now().plusDays(14);
        this.dateRetourReelle = null;
        this.rendu            = false;
    }

    // ── Constructeur avec paramètres
    public Emprunt(int idEmprunt, Membre membre,
                   Exemplaire exemplaire) {
        this.idEmprunt        = idEmprunt;
        this.membre           = membre;
        this.exemplaire       = exemplaire;
        this.dateEmprunt      = LocalDate.now();
        this.dateRetourPrevue = LocalDate.now().plusDays(14);
        this.dateRetourReelle = null;
        this.rendu            = false;

        // Marquer l'exemplaire comme emprunté
        exemplaire.setDisponible(false);
    }

    // ── Getters
    public int        getIdEmprunt()        { return idEmprunt; }
    public Membre     getMembre()           { return membre; }
    public Exemplaire getExemplaire()       { return exemplaire; }
    public LocalDate  getDateEmprunt()      { return dateEmprunt; }
    public LocalDate  getDateRetourPrevue() { return dateRetourPrevue; }
    public LocalDate  getDateRetourReelle() { return dateRetourReelle; }
    public boolean    isRendu()             { return rendu; }

    // ── Retourner un livre
    public void retourner() {
        if (rendu) {
            System.out.println("Ce livre a déjà été rendu !");
            return;
        }

        this.dateRetourReelle = LocalDate.now();
        this.rendu            = true;
        this.exemplaire.setDisponible(true);

        // Calculer amende si retard
        if (dateRetourReelle.isAfter(dateRetourPrevue)) {
            long joursRetard = dateRetourReelle.toEpochDay()
                    - dateRetourPrevue.toEpochDay();
            double amende = joursRetard * AMENDE_PAR_JOUR;
            membre.ajouterAmende(amende);
            System.out.println("Retard de " + joursRetard
                    + " jour(s). Amende : " + amende + " F");
        } else {
            System.out.println("Retour dans les délais !");
        }
    }

    // ── toString
    @Override
    public String toString() {
        return "Emprunt #"     + idEmprunt
                + " | Membre : "  + membre.getPrenom()
                + " " + membre.getNom()
                + " | Livre : "   + exemplaire.getLivre().getTitre()
                + " | Emprunté : " + dateEmprunt
                + " | Limite : "  + dateRetourPrevue
                + " | Statut : "  + (rendu ? "Rendu" : "En cours");
    }
}
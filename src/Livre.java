public class Livre {

    // ── Attributs
    private String isbn;
    private String titre;
    private String auteur;
    private int    anneePublication;
    private String genre;

    // ── Constructeur sans paramètre
    public Livre() {
        this.isbn             = "";
        this.titre            = "";
        this.auteur           = "";
        this.anneePublication = 0;
        this.genre            = "";
    }

    // ── Constructeur avec paramètres
    public Livre(String isbn, String titre, String auteur,
                 int anneePublication, String genre) {
        this.isbn             = isbn;
        this.titre            = titre;
        this.auteur           = auteur;
        this.anneePublication = anneePublication;
        this.genre            = genre;
    }

    // ── Getters
    public String getIsbn()             { return isbn; }
    public String getTitre()            { return titre; }
    public String getAuteur()           { return auteur; }
    public int    getAnneePublication() { return anneePublication; }
    public String getGenre()            { return genre; }

    // ── Setters
    public void setIsbn(String isbn)     { this.isbn = isbn; }
    public void setTitre(String titre)   { this.titre = titre; }
    public void setAuteur(String auteur) { this.auteur = auteur; }

    public void setAnneePublication(int annee) {
        if (annee > 0 && annee <= 2026) {
            this.anneePublication = annee;
        } else {
            System.out.println("Année invalide !");
        }
    }

    public void setGenre(String genre) { this.genre = genre; }

    // ── toString
    @Override
    public String toString() {
        return "ISBN : "      + isbn
                + " | Titre : "  + titre
                + " | Auteur : " + auteur
                + " | Année : "  + anneePublication
                + " | Genre : "  + genre;
    }
}
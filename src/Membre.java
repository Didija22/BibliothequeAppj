public class Membre{
// declaration des attibuts
private String prenom;
private String nom;
private String idMembre;

//constructeur sans parametre 
public Membre(){};

//constructeur avec parametre
public Membre(String prenom, String nom, String idMembre){
    this.prenom = prenom;
    this.nom = nom;
    this.idMembre = idMembre;
}

// les foncctions get
public String getPrenom(){return prenom;}
public String getNom(){return nom;}
public String getIdMembre(){return idMembre;}

//Les fonctions set
public void setPrenom(String prenom){this.prenom=prenom;}
public void setNom(String nom){this.nom=nom;}
public void setIdMembre(String idMembre){this.idMembre=idMembre;}}
// declaration des attibuts
private String prenom;
private String nom;
private String idMembre;

//constructeur sans parametre 
public Membre(){};

//constructeur avec parametre
public Membre(String prenom, String nom, String idMembre){
    this.prenom = "prenom";
    this.nom = "nom";
    this.idMembre = "Cg4";
}

// les foncctions get
String getPrenom(){return prenom;}
String getNom(){return nom;}
String getIdMembre(){return idMembre;}

//Les fonctions set
void setPrenom(String prenom){this.prenom=prenom;}
void setNom(String nom){this.nom=nom;}
void setIdMembre(String Membre){this.membre=membre;}
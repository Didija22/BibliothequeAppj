public class Emprunt{
    private String idEmprunt;
    private String idLivre;
    private String idMembre;
    private String dateEmprunt;
    private String dateRetour;

    //constructeur sans parametre
    public Emprunt(){}

    //constructeur avec parametre
    public Emprunt(String idEmprunt, String idLivre, String idMembre,
        String dateEmprunt, String dateRetour){
            this.idEmprunt = idEmprunt;
            this.idLivre=idLivre;
            this.idMembre=idMembre;
            this.dateEmprunt=dateEmprunt;
            this.dateRetour=dateRetour;
        }
    
        //fonction get
        public String getIdEmprunt(){return idEmprunt;}
        public String getIdLivre(){return idLivre;}
        public String getIdMembre(){return idMembre;}
        public String getDateEmprunt(){return dateEmprunt;}
        public String getDateRetour(){return dateRetour;}

        //fonction set
        public void setIdEmprunt(String idEmprunt){this.idEmprunt=idEmprunt;}
        public void setIdLivre(String idLivre){this.idLivre=idLivre;}
        public void setIdMembre(String idMembre){this.idMembre=idMembre;}
        public void setDateEmprunt(String dateEmprunt){this.dateEmprunt=dateEmprunt;}
        public void setDateRetour(String dateRetour){this.dateRetour=dateRetour;}






}
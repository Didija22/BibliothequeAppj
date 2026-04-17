public class Capteur {

    // ── Attributs
    private int    idCapteur;
    private String localisation;
    private double temperature;
    private double humidite;

    // Seuils normaux de conservation
    private static final double TEMP_MIN  = 15.0;
    private static final double TEMP_MAX  = 25.0;
    private static final double HUMID_MIN = 30.0;
    private static final double HUMID_MAX = 60.0;

    // ── Constructeur sans paramètre
    public Capteur() {
        this.idCapteur    = 0;
        this.localisation = "";
        this.temperature  = 20.0;
        this.humidite     = 45.0;
    }

    // ── Constructeur avec paramètres
    public Capteur(int idCapteur, String localisation) {
        this.idCapteur    = idCapteur;
        this.localisation = localisation;
        this.temperature  = 20.0;
        this.humidite     = 45.0;
    }

    // ── Getters
    public int    getIdCapteur()    { return idCapteur; }
    public String getLocalisation() { return localisation; }
    public double getTemperature()  { return temperature; }
    public double getHumidite()     { return humidite; }

    // ── Setters avec vérification automatique
    public void setTemperature(double temperature) {
        this.temperature = temperature;
        verifierConditions();
    }

    public void setHumidite(double humidite) {
        this.humidite = humidite;
        verifierConditions();
    }

    public void setIdCapteur(int id)          { this.idCapteur = id; }
    public void setLocalisation(String local) { this.localisation = local; }

    // ── Vérifier les conditions
    public void verifierConditions() {
        boolean ok = true;

        if (temperature < TEMP_MIN || temperature > TEMP_MAX) {
            System.out.println("ALERTE [" + localisation + "] "
                    + "Temperature anormale : "
                    + temperature + "C");
            ok = false;
        }

        if (humidite < HUMID_MIN || humidite > HUMID_MAX) {
            System.out.println("ALERTE [" + localisation + "] "
                    + "Humidite anormale : "
                    + humidite + "%");
            ok = false;
        }

        if (ok) {
            System.out.println("OK [" + localisation + "] "
                    + "Conditions normales.");
        }
    }

    // ── toString
    @Override
    public String toString() {
        return "Capteur #"      + idCapteur
                + " | "            + localisation
                + " | Temp : "     + temperature + "C"
                + " | Humidite : " + humidite + "%";
    }
}
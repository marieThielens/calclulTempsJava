package be.bxl.formation.models;

public class Duree {
    private int jours;
    private int heures;
    private int minutes;
    private int secondes;
    private int tempsTotal;

    // Getters
    public int getJours() {
        return this.jours;
    }
    public int getHeures() {
        return this.heures;
    }
    public int getMinutes() {
        return this.minutes;
    }
    public int getSecondes() {
        return this.secondes;
    }
    public int tempsTotal() {
        return this.tempsTotal;
    }


    public String getTempsTotal(){
        if( this.secondes >= 60) {
            this.secondes++;
        }
        if(this.minutes >= 60) {
            this.heures++;
        }
        if (this.heures >= 24) {
            this.jours++;
        }
        String  tempsFinal =" Il y a " + this.jours + " jours, " + this.heures + " heures " + this.minutes + " minutes " + "et " +this.secondes + " secondes";
        return tempsFinal;
    }

    // setters
    public void setSecondes(int secondes) {
        this.secondes = secondes;
    }

// mon constructeur
    public Duree(int jours, int heures, int minutes, int secondes ){
    this.jours = jours;
    this.heures = heures;
    this.minutes = minutes;
    this.secondes = secondes;
    }
    // surcharge

}

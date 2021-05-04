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
    public void getTempsTotal(){
        if( this.secondes >= 60) {
            this.minutes++;
        }
        if(this.minutes >= 60) {
            this.heures++;
        }
        if (this.heures >= 24) {
            this.jours++;
        }
    }
    public void dureeAsoustraire(){
        
    }
    // setters

// mon constructeur
    public Duree(int jours, int heures, int minutes, int secondes ){
    this.jours = jours;
    this.heures = heures;
    this.minutes = minutes;
    this.secondes = secondes;
    getTempsTotal();
    }
}

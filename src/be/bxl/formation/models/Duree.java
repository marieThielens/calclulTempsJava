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
        System.out.println("");
    }
    // setters

// mon constructeur
    public Duree(int jours, int heures, int minutes, int secondes ){
    this.jours = jours;
    this.heures = heures;
    this.minutes = minutes;
    this.secondes = secondes;
    }
}

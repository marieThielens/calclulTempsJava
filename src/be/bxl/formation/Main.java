package be.bxl.formation;

import be.bxl.formation.models.Duree;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Duree t1 = new Duree(
            5,
            25,
            58,
            125
        );
        Duree t2 = new Duree(
          1,24, 25, 30
        );

        System.out.println("Personne 1: " + t1.getTempsTotal());
        System.out.println("Personne 2: " + t2.getTempsTotal());
        System.out.println("Temps total: " );
    }
}

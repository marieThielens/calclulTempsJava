package be.bxl.formation;

import be.bxl.formation.models.Duree;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Duree t1 = new Duree(
            5,
            6,
            58,
            125
        );
        System.out.println(t1.getJours());
    }
}

package model;

import java.util.ArrayList;

public class Grille {

    ArrayList<ArrayList<Case>> grille;

    public static void generateGrille(int n){
        // Generate a new grille of size n
        ArrayList<ArrayList<Case>> grille = new ArrayList<ArrayList<Case>>();
        for (int i = 0; i < n; i++) {
            ArrayList<Case> row = new ArrayList<Case>();
            for (int j = 0; j < n; j++) {
                row.add(new Case());
            }
            grille.add(row);
        }
    }
}

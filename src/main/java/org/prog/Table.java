package org.prog;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Table {

    private double longueur;
    private double largeur;
    private String etat;
    private String couleur;


    public double getSurface() {
        return longueur * largeur;
    }
}


package com.dasrado.school.java.uf1.exercises;

public class Precendence_5 {
    public static void main(String[] args) {
        int a = 8;
        int b = 4;
        int c = 2;

        // Sense parèntesis
        int resultat1 = a / b * c;
        System.out.println("Resultat sense parèntesis: " + resultat1);

        // Amb parèntesis
        int resultat2 = a / (b * c);
        System.out.println("Resultat amb parèntesis: " + resultat2);

        // Pregunta: Com canvien els resultats en funció de l'ús dels parèntesis?
        // Explica l'ordre de les operacions segons la precedència dels operadors aritmètics.


    }
}

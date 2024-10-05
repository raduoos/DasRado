package com.dasrado.school.java.uf1.exercises;

public class CombinationOperators_3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        // Sense parèntesis
        boolean resultat1 = a + b > c && c > b;
        System.out.println("Resultat sense parèntesis: " + resultat1);

        // Amb parèntesis
        boolean resultat2 = (a + b > c) && (c > b);
        System.out.println("Resultat amb parèntesis: " + resultat2);

        // Pregunta: Com influeixen els parèntesis en l'ordre de les operacions i el resultat final?


    }
}

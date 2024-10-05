package com.dasrado.school.java.uf1.exercises;

public class AssignationOperators_4 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 15;

        // Sense parèntesis
        int resultat1 = x += y * z;
        System.out.println("Resultat sense parèntesis: " + resultat1);

        // Amb parèntesis
        int resultat2 = (x += y) * z;
        System.out.println("Resultat amb parèntesis: " + resultat2);

        // Pregunta: Què passa amb el valor de x en cada cas?
        // Per què hi ha una diferència en el resultat?

    }
}

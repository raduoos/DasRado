package com.dasrado.school.java.uf1.exercises;

public class LogicOperations_2 {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        boolean z = true;

        // Sense parèntesis
        boolean resultat1 = x || y && z;
        System.out.println("Resultat sense parèntesis: " + resultat1);

        // Amb parèntesis
        boolean resultat2 = (x || y) && z;
        System.out.println("Resultat amb parèntesis: " + resultat2);

        // Pregunta: Què canvia en els resultats en cada cas?
        // Com afecten els operadors lògics OR (||) i AND (&&) segons la precedència?

        // -
    }
}

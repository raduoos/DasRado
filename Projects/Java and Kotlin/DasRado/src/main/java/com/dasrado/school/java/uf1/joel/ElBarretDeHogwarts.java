package com.dasrado.school.java.uf1.joel;

import java.util.Scanner;

public class ElBarretDeHogwarts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer = scanner.nextLine();
        if (answer.equals("Coratge")){
            System.out.println("Gryffindor");
        } else if (answer.equals("Coneixement")) {
            System.out.println("Ravenclaw");
        } else if (answer.equals("Ambicio")) {
            System.out.println("Slytherin");
        } else {
            System.out.println("Hufflepuff");
        }
    }
}
package com.dasrado.school.java.uf1.joel;

import java.util.Scanner;

public class DiesCorrectes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number >= 1 && number <= 365){
            System.out.println("Correcte per un any no bixest!");
        } else if (number == 366) {
            System.out.println("Correcte per un any bixest!");
        } else {
            System.out.println("Incorrecte!");
        }
    }
}
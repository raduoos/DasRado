package com.dasrado.school.java.uf1.joel;

import java.util.Scanner;

public class DiesCorrectes2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day, year;

        //System.out.println("Insert a day of the year");
        day = scanner.nextInt();

        //System.out.println("Insert a year");
        year = scanner.nextInt();


        if (day >= 1 && day <= 365){
            System.out.println("Correcte i any qualsevol!");
        } else if (day == 366 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Correcte i any bixest!");
        } else if (day == 366 && !(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)){
            System.out.println("Incorrecte per any no bixest!");
        } else {
            System.out.println("Incorrecte per qualsevol any!");
        }
    }
}

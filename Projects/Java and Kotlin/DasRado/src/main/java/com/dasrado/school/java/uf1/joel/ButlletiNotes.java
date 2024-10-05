package com.dasrado.school.java.uf1.joel;

import java.util.Scanner;

public class ButlletiNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var = scanner.nextInt();

        switch (var){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspes");
                break;
            case 5:
            case 6:
                System.out.println("Aprovat");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Excelent");
                break;
        }
    }
}

package com.dasrado.school.java.uf1.worksInClass;

import java.util.Scanner;

public class Tuesday20241001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var;

        System.out.print("Enter an integer: ");
        var = scanner.nextInt();

        switch (var) {
            case 0:
                System.out.println("You inserted a 0, I will increment your value");
                var++;
                break;
            case 1:
                System.out.println("You inserted a 1, I will multiply your value * 10");
                var = var * 10;
                break;
            case 2:
                var--;
                break;
            case 3:
                var--;
                break;
            default:
                System.out.println("Invalid input");

        }
    }
}

class Tuesday20241001_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var;

        System.out.print("Enter an integer: ");
        var = scanner.nextInt();

        switch (var) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("You inserted a number smaller than 5");
                break;
            case 5:
                System.out.println("You inserted a 5");
                break;
        }
    }
}

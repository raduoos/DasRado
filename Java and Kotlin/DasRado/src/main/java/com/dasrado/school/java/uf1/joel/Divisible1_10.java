package com.dasrado.school.java.uf1.joel;

import java.util.Scanner;

public class Divisible1_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        if (number % 9 == 0 && number % 8 == 0 && number % 7 == 0 && number % 5 == 0) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}

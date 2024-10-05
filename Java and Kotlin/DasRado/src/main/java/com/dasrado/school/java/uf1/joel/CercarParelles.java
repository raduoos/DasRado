package com.dasrado.school.java.uf1.joel;

import java.util.Scanner;

public class CercarParelles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        boolean isEqual = false;
        isEqual = number == number2 || number2 == number3 || number == number3;

        System.out.println(isEqual ? "SI" : "NO");
    }
}

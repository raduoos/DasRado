package com.dasrado.school.java.uf1.worksInClass;

import java.util.Scanner;

public class Tuesday20240924 {
    public static void main(String[] args) {
        int x = 9, y = 8;

        x = y + 1;
        x = x + y;
        x += y;

        x = x - y; // x -= y
        x = x * y; // x *= y
        x = x / y; // x /= y

        x = x + 1;
        x++; ++x;
        x += 1;

        x = x - 1;
        x--; --x;
        x -= 1;
    }
}

class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = scanner.nextInt();

        if (age >= 18){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
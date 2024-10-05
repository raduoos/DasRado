package com.dasrado.school.java.uf1.joel;

import java.util.Scanner;

public class CaramelsSobrants {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int candy, kids;
        candy = scanner.nextInt();
        kids = scanner.nextInt();

        System.out.println(candy % kids);
    }
}

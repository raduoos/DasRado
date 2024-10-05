package com.dasrado.school.java.uf1.joel;

import java.util.Scanner;

public class AnyDeTraspas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Els anys de traspàs son aquells divisibles entre 4.
        // A no ser que siguin divisibles entre 100, que aleshores no ho són.
        // Però si ho són entre 400 llavors sí que ho són.

        int value = scanner.nextInt();

        if (value % 4 == 0 && value % 100 != 0 || value % 400 == 0) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}

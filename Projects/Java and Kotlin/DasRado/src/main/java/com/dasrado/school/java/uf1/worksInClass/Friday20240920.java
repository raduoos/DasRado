package com.dasrado.school.java.uf1.worksInClass;

//This is a comment

/*
This is
multiple line
comment
*/

import java.util.Scanner;

public class Friday20240920 {
    //The variables of Java
    public static void main(String[] args) {
        System.out.println("Hello World!"); //This is a string
        System.out.println(19); //This is integer number
        System.out.println(24.20); //This is float double number
        System.out.println(true); //This is boolean as true
        System.out.println(false); //This is boolean as false
        System.out.println('c'); //This is a character 'c'
        System.out.println(0x0027); //This is a Unicode character
    }
}

class Variables {
    public static void main(String[] args) {
        //Declaration of integer number
        int radoAge = 19;
        System.out.println(radoAge);

        //Another way to declare an integer
        int number, integerNumber;
        number = 2;
        integerNumber = 4;

        System.out.println(number + integerNumber);

        //More variables
        int number2;
        double sou;
        boolean married;

        number2 = 2;
        sou = 22.2;
        married = false;

        System.out.println(number2);
        System.out.println(sou);
        System.out.println(married);
    }
}

class VariablesFromUser{
    public static void main(String[] args) {
        //Scanner thing
        Scanner scanner = new Scanner(System.in);

        //Reading data from the user's input and showing his inserted data.
            System.out.print("Enter your name: ");
                String name = scanner.nextLine();
            System.out.print("Enter your age: ");
                int age = scanner.nextInt();
            System.out.print("Enter your height in meters: ");
                double height = scanner.nextDouble();

        //Leaving one line empty for space
        System.out.println(" ");

        //Showing the data
        System.out.println(
                "Hello " + name + "!" +
                " You are " + age + " years old." +
                " Your height is " + height + " meters." +
                " Next year you will be " + (age+1) + " years old."
        );
    }
}

package com.dasrado.school.java.uf1.exercises;

public class NumberOperators_1 {
    public static void main(String[] args) {
        // Exercise 1: Find the difference in the calculations with/without parenthesis

        int a = 10;
        int b = 20;
        int c = 30;

        //Without parenthesis
        int result1 = a + b * c;
        System.out.println("Result without parenthesis: " + result1);

        //With parenthesis
        int result2 = (a + b) * c;
        System.out.println("Result without parenthesis: " + result2);

        //Answer: The operation without parenthesis -
        // calculates with priority 20 x 30 that is 600, and later adds + 10 which makes 610.

        //The another operation with parenthesis -
        // calculates 10 + 20 with priority that makes 30 and later multiplies * 30,
        // which makes 900

        //In general: The difference is that the operations without parenthesis and parenthesis
        // changes the priority of the calculation which can lead to different result
    }
}

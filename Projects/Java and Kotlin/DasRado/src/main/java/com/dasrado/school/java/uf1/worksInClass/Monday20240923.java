package com.dasrado.school.java.uf1.worksInClass;

public class Monday20240923 {
    public static void main(String[] args) {

        //Declaration of variables
        int a, b, c, d, e, f = 9;
        e = 23;
        a = b = c = d = e = f;
        a = 3;
        b = 2;
        c = 5;
        d = ((a + ((b * c) / 65)) + 42);

        int quotient = a / b;
        int rest = a % b;

        System.out.println(a + " divided by " + b + " is equal to " + quotient);
        System.out.println("and the rest is equal to " + rest);
        System.out.println(" ");

        //I will force the division to be double. doing casting
        double realQuotient = (double) a / b;

        //Another way to do it
        realQuotient = a * 1.0 / b;

        //Another way to do it
        realQuotient = (a * 0.0) / b;

        System.out.println(a + " really divided by " + b + " is equal to " + realQuotient);

    }
}

class Booleans {
    public static void main(String[] args) {
        boolean isA, isB, isC;

        isA = true;
        isB = false;
        isC = isA = isB = false;

        boolean result = (isA || ((!isB) && isC));

        System.out.println(result);
    }
}

class Booleans2{
    public static void main(String[] args) {
        int a = 0;
        int b = 5;

        boolean result = (((a == 0) && (a > b)) || (a * 23 % 7 == 0));

        System.out.println(result);

    }
}

class CoincidentTypes {
    public static void main(String[] args) {
        String string = "I am a string";
        int number = 56;

        string = "Old text " + string + " posterior text";

        System.out.println("The string \"" + string + "\" has a longitude of " + string.length() + " characters");

        string = "45";
        string = number + "";

        double real = 6.05; //Automatic conversion from integer to real
        number = (int) 23.56;   //Forced to be cast from real to integer
    }
}
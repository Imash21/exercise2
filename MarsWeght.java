package com.example;

public class MarsWeightCalculator {
    public static void main(String[] args) {

        float earthWeight;
        float marsWeight ;
        double marsWeightINDouble;
        int marsWeightINInt;

        earthWeight = 84;
        marsWeight = (earthWeight =  0.38F);
        System.out.println(earthWeight + "Fg on Earth is " + marsWeight + "Kg on Mars" );
        marsWeightINDouble = marsWeight;
        System.out.println ("Kilogram on Mars after converting to Double" +marsWeightINDouble);
        System.out.printf("Kilogram in Mars displayed to four decimal places: %.4f %n", marsWeightINDouble);
        marsWeightINInt = (int)marsWeightINDouble;
        System.out.println("Kilograms on Mars casted to integer" +marsWeightINInt);
        char c = (char)marsWeightINInt;
        System.out.println("the ASCII table equivalent  of marsWeightInInt is:" +c);
        int exampleOfMathOnChar = c * c;
        System.out.println("An example of a mathematical operation on the char type: "+ exampleOfMathOnChar);
    }
}

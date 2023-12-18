package Week_5.In_Class_Examples;

import java.util.Scanner;

public class MathInfo {
    //final keyword
    //final variables  - the keyword is used to indicate the value cannot be changed(it becomes constant)
    //                 - value must be assigned exactly one time.
    //final methods    - the keyword is used to indicate that the method cannot be overridden by the subclasses.
    //                 - subclasses cannot provide a different implementation for a final method.
    //final classes    - cannot be extended (subclassed). It is the final class.
    //final parameters - the parameter should not be modified by a method

    //constants declared using the final keyword
    private static final double PI = 3.141592653589793;
    private static final int MAX_COUNT = 88;

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        //Calling our function with PI constant
        displayCircumferenceUsingPI();

        //Using our MAX_COUNT
        displayMaxValueUsingMAX_COUNT();
        displayMinValueUsingMAX_COUNT();

        System.out.println("Enter your name");
        String name = console.nextLine();

        //Display lower case name
        displayLowerCaseName(name);

        //Display upper case name
        displayUpperCaseName(name);

        //Reverse the name using StringBuilder
        displayReversedNamed(name);

        //Take in two integers
        System.out.println("Enter your first integer");
        int numOne = Integer.parseInt(console.nextLine());

        System.out.println("Enter your second integer");
        int numTwo = Integer.parseInt(console.nextLine());

        //Adds
        displayAddition(numOne, numTwo);

        //Subtracts
        displaySubtraction(numOne, numTwo);

        //SquareRoot
        displaySquareRoot(numOne);

        //pPower
        displayPower(numOne, numTwo);

        //Logarithm
        displayLogarithm(numOne);

        //Math.min()
        displayMinValue();

        //Math.max()
        displayMaxValue();

        //Displays Rounded Values   `
        displayRoundedValue();


    //************** Methods outside the main method *************

    }
    //Display lower case name
    public static void displayLowerCaseName(String name){
        System.out.println(name.toLowerCase());
    }

    //Display upper case name
    public static void displayUpperCaseName(String name){
        System.out.println(name.toUpperCase());
    }

    //Display reversed name using StringBuilder
    public static void displayReversedNamed(String name){
        StringBuilder reverseName = new StringBuilder(name);
        System.out.println(reverseName.reverse());
    }

    //Display addition
    public static void displayAddition(int numOne, int numTwo){
        int add = (numOne + numTwo);
        System.out.printf(" %d + %d = %d%n", numOne, numTwo, add);
    }

    //Display subtraction
    public static void displaySubtraction(int numOne, int numTwo){
        int subtract = (numOne - numTwo);
        System.out.printf(" %d - %d = %d%n", numOne, numTwo, subtract);
    }

    //Display square root
    public static void displaySquareRoot(int numOne){
        double sqrt1 = Math.sqrt(numOne);
        System.out.printf("The square root of %d is %.2f%n", numOne, sqrt1);
    }

    //Display power
    public static void displayPower(int numOne, int numTwo){
        double power = Math.pow(numOne, numTwo);
        System.out.printf("The power of %d and %d is: %.2f%n", numOne, numTwo, power);
    }

    //Display logarithm
    public static void displayLogarithm(int numOne){
        double logar = Math.log(numOne);
        System.out.printf("The log of %d is: %.2f%n", numOne, logar);
    }

    //Display maximum value
    public static void displayMaxValue(){
        System.out.println(Math.max(4, 88));
    }

    //Display minimum value
    public static void displayMinValue(){
        System.out.println(Math.min(4, 88));
    }

    public static void displayMaxValueUsingMAX_COUNT(){
        System.out.println(Math.max(4, MAX_COUNT));
    }

    public static void displayMinValueUsingMAX_COUNT(){
        System.out.println(Math.min(4, MAX_COUNT));
    }

    //Display rounded value
    public static void displayRoundedValue(){
        System.out.println("Round 3.44");
        System.out.println(Math.round(3.44));
    }

    //Display the circumference of the circle using our PI constant
    private static void displayCircumferenceUsingPI(){
        double radius = 5.0;
        //Using our constant
        double circumference = 2 * PI * radius;
        System.out.println("Circumference of the circle: " + circumference);
    }


}






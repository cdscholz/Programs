package Week_2.In_Class_Examples;

import java.util.Scanner;

public class IntegerDiv {
    public static void main(String[] args) {

        //Console input
        //Scanner class
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = keyboard.nextLine(); //Whatever they enter will go into the variable "name"
        System.out.println(name);
        //.nextInt - = SAME BUT WITH AN INTEGER
        System.out.println("What is your age?");
        int age = keyboard.nextInt();
        System.out.println(age);
        //MORE EFFICIENT way rather than using .nextInt
        int age = Integer.parseInt(keyboard.nextLine());
        System.out.println(age);
        //.nextDouble - SAME BUT WITH A DOUBLE
        System.out.println("Enter in you gpa");
        double gpa = keyboard.nextDouble();
        System.out.println(gpa);
        //MORE EFFICIENT way rather than using .nextDouble
        System.out.println("Enter in you gpa");
        double gpa = Double.parseDouble(keyboard.nextLine());
        System.out.println(gpa);


        int numOne = 1;
        int numTwo = 4;
        // Casting integer as a double
        double results = (double)numOne/numTwo;
        System.out.print(results);
        System.out.println();

        //does integer division then cast as a double
        double result = (double)(numOne/numTwo);
        System.out.print(result);

        //CLOSES OUT YOUR SCANNER
        keyboard.close();





    }
}

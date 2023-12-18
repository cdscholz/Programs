package Week_2.Activity_2;

import java.util.Scanner;

public class UserMath {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Enter your first integer: ");
        int numOne = Integer.parseInt(console.nextLine());

        System.out.println("Enter your second integer: ");
        int numTwo = Integer.parseInt(console.nextLine());

        //Addition +
        int add = (numOne + numTwo);
        System.out.printf(" %d  +  %d  =  %d%n", numOne, numTwo, add);

        //Subtraction -
        int diff = (numOne - numTwo);
        System.out.printf(" %d  -  %d  =  %d%n",numOne,numTwo,diff);

        //Multiplication *
        int prod = (numOne * numTwo);
        System.out.printf(" %d  *  %d  =  %d%n",numOne,numTwo,prod);

        //Division /
        int division = (numOne / numTwo);
        System.out.printf(" %d  /  %d  =  %d%n",numOne,numTwo,division);

        //Square Roots
        double sqrt1 = Math.sqrt(numOne);
        System.out.printf("The square root of %d is %.2f ", numOne, sqrt1);

        //Power
        double power = Math.pow(numOne, numTwo);
        System.out.printf("The power of %d and %d is: %.2f ", numOne, numTwo, power);

        //Logarithm
        double logar = Math.log(numOne);
        System.out.printf("The log of %d is: %.2f ", numOne, logar);

        //Math.abs()
        double abs = Math.abs(numOne);
        System.out.printf("The absolute value of %d is: %.2f",numOne,abs);

        //Math.max
        //System.out.println(Math.max(4, 88));

        //Math.min()
        //System.out.println(Math.min(4, 88));

    }
}
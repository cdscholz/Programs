package Week_3.Activity_3;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args)
    {
//Activity 3 - Even or Odd (Logical Operators Activity)

        Scanner keyboard = new Scanner(System.in);

        int number;

        //Prompt the user to enter a number
        System.out.println("Enter a number between 1 and 9");
        number = Integer.parseInt(keyboard.nextLine());

        if (number == 1) {
        System.out.println("The number you entered is odd");
        }
        else if ( number == 3) {
        System.out.println("The number you entered is odd");
        }
        else if ( number == 5) {
            System.out.println("The number you entered is odd");
        }
        else if ( number == 7) {
            System.out.println("The number you entered is odd");
        }
        else if ( number == 9) {
            System.out.println("The number you entered is odd");
        }
        else {
        System.out.println("The number you entered is even");
        }




    }
}

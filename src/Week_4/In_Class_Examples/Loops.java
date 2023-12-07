package Week_4.In_Class_Examples;

import java.util.ArrayList;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        //*********************************** For Loops ************************************

        Scanner console = new Scanner(System.in);

        //Declare variables
        int floors;

        System.out.println("Enter the number of floors: ");
        floors = Integer.parseInt(console.nextLine());

        for(int i = 1; i <= floors; i++){
            System.out.println("This is floor: " + i);
        }

        /* Program Output:
        Enter the number of floors:
        -3-
        This is floor: 1
        This is floor: 2
        This is floor: 3
         */

        //********************************** While Loops ***********************************

        int i = 0;

        while(i < 5){
            //Code to be executed as long as 'i' is less than 5
            i++;
        }

        //*************************** While(True) Loops --> break **************************

        //declare variables
        String message = "\n";

        while(true){
            System.out.println("Type 'exit' to quit or enter your favorite TV show:\n");
            String favoriteTvShow = console.nextLine();
            if(favoriteTvShow.equals("exit")){
                System.out.println("\nThank you for entering your favorite shows. GoodBye!");
                break; //Exit the loop when the valid input of the user is provided
            }
            else{
                message = message + "\n" + favoriteTvShow;
                System.out.println("Your favorite TV show is: " + message + "\n");
            }
        }

        /* Program Output:
        Type 'exit' to quite or enter your favorite TV show:

         */
        // Program will add shows to list at the top of the input screen as they
        // are inputted until the user types "exit" and breaks the loop

        //*********************** Do While Loops --> @ least one time **********************

        int userChoice;

        do{
            //Display a menu
            System.out.println("Menu:\n1. Start Game\n2. Load Game\n3. Exit\nEnter your choice (1, 2, or 3): ");
            userChoice = Integer.parseInt(console.nextLine());

            //Process the users choice
            switch(userChoice){
                case 1:
                    System.out.println("Starting a new game....");
                    break;
                case 2:
                    System.out.println("Loading a saved game....");
                case 3:
                    System.out.println("Exiting the program....");
                    break;
                default: //If the user enters something that is not one of the choices above
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }while(userChoice != 3);  //If user enters "3" it exits the program, dropping out of the 'while' loop

        /* Program Output:
        Menu:
        1. Start Game
        2. Load Game
        3. Exit
        Enter your choice (1, 2, or 3):
         */

        //********************************** Nested Loops **********************************

        int rows = 3;
        int columns = 4;

        for(int k = 0; k < rows; k++){
            System.out.println("The row number is: "+ k + "\n");
            for(int j = 0; j < columns; j++){
                System.out.println("The column number is: "+ j + "\n");
            }
        }

        /* Program Output:
        The row number is: 0

        The column number is: 0

        The column number is: 1

        The column number is: 2

        The column number is: 3

        The row number is: 1

        The column number is: 0

        The column number is: 1

        The column number is: 2

        The column number is: 3

        The row number is: 2

        The column number is: 0

        The column number is: 1

        The column number is: 2

        The column number is: 3
         */

        //********************************* For Each Loops *********************************

        int [] numbers = {1,2,3,4,5};
        for(int num: numbers){
            System.out.println(num);
        }

        ArrayList<String>fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Cherries");
        for(String fruit: fruits){
            System.out.println(fruit);
        }

        /* Program Output:
        1
        2
        3
        4
        5

        Apple
        Orange
        Banana
        Cherries
         */


    }
}

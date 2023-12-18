package Week_5.In_Class_Examples;

import javax.swing.*;
import java.util.Scanner;
import java.util.Random;

public class MethodsDemo {
    public static void main(String[] args) {

        //WHAT I WROTE:

        Scanner console = new Scanner(System.in);

        //methods

        //access modifiers (briefly)
        //return types
        //parameter lists --> arguments
        //method body

        //Prompting the user for information
        String Name = JOptionPane.showInputDialog("Enter users name:");
        String passW = JOptionPane.showInputDialog("Enter user's password:");
        int score = Integer.parseInt(JOptionPane.showInputDialog("Enter user's score:"));

        //Calling the displayUserInfo() method
        //Camel Case when creating a method
        //displayUserInfo(String, int, String);
        String userInfo = displayUserInfo(Name,passW, score);
        System.out.println(userInfo);
        //Another way to do same thing ^^ System.out.println(displayUserInfo(name, password, score);
        //Passing in arguments
        displayUserInfo("Giselle", "1234&%&*74", 77);

        //Calling to the randomExtraPoints() method
        int newPoints = 0;
        newPoints = randomExtraPoints(score);
        newPoints = randomExtraPoints(77);  //Argument passed
        //Printing it out to user in 2 different ways:
        JOptionPane.showMessageDialog(null, randomExtraPoints(77));
        System.out.println(randomExtraPoints(score));
        System.out.println(newPoints);
        /* Output:
        57
        78
         */

        //Example of passing in an argument vs. variable
        System.out.println("Hello");    //Argument
        String welcomeMessage = "Hello";
        System.out.println(welcomeMessage); //Variable
    }

    //Return data type is an integer
    //Return randomly generated points and add to current points
    public static int randomExtraPoints(int points)
    {
        //Instance of Random class
        Random rand = new Random();
        //Generate a random number between 1 and 10(inclusive of 10)
        int randomNumber = rand.nextInt(10) + 1;

        //Check if the random number is even using if statements
        if(randomNumber % 2 == 0){
            //If it's even, return a number between 1 and 10 added to the points
            int randomNumberFinal = rand.nextInt(10) + 1;
            int newPoints = randomNumberFinal + points;
            return newPoints;
            //Another way to do the same thing ^^ Option 2: return rand.nextInt(10) + 1;
        }else{
            //If it's not even, return 0 extra points
            return points;
            //Option 2: return 0;
        }

    }
    //Takes in three parameters: Name, password, scores
    //Returns a string that will display user's information
    public static String displayUserInfo(String name, String password, int score){
        String userInfo = String.format("Name: %-20s Password: %-20s Score: %d", name, password, score);

        return userInfo;
    }
}

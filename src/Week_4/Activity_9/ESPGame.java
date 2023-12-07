package Week_4.Activity_9;

import javax.swing.*;
import java.util.Random;

public class ESPGame {
    public static void main(String[] args){

        // Random number generator (Range between : 0 and 4)

        // 0 = Red
        // 1 = Green
        // 2 = Blue
        // 3 = Orange
        // 4 = Yellow

        // Create an instance of the random class
        Random random = new Random();

        //Initialize variables
        int correct = 0; // int correct --> hold the number of guesses
        int number;      // Random selected number representing a color
        String color;    // Computer generated color
        String guess;    // The user's guess for the color

        // Displayed 10 times for loop -->
        for(int i = 1; i<= 10; i++) {

            //Range between 0 and 4
            number = random.nextInt(5);

            //Map out the random number to a color
            if(number == 0){
                color = "red";
            }else if (number == 1){
                color = "green";
            }else if (number == 2){
                color = "blue";
            }else if (number == 3){
                color = "orange";
            }else {
                color = "yellow";
            }

            //Take in info from user
            // Pick: Scanner or JOption Pane
            guess = JOptionPane.showInputDialog(null, String.format("%d. What color has the computer chosen? \n", i));

            // Display the computer's picked color
            JOptionPane.showMessageDialog(null, "The computer chose " + color);

            //Check if the users guess is correct and update the count
            if(guess.equals(color)){
                // Increase correct (Incrementing the variable "correct")
                correct++;

    }
}

        // Display the number of correct guesses
        JOptionPane.showMessageDialog(null, "You got " + correct + " out of 10 correct\n");

    }
}

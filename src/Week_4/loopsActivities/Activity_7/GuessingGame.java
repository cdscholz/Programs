package Week_4.loopsActivities.Activity_7;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args)
    {
    //Activity 7 - Guessing Game (while loop activity)

        //Prompt user
        int randomInt = (int) (Math.random() * (100 - 1));
        Scanner console = new Scanner(System.in);
        int numberGuesses = 0;

        System.out.println("Guess a number between 1 and 100 or enter q if you give up: ");
        while(true){
            String values = JOptionPane.showInputDialog("Guess a number between 1 and 100 or enter q if you give up");
            if(values.equals("q")){
                JOptionPane.showMessageDialog(null, "Quitter! The number was " + randomInt);
                break;
            }else
            {
                int num = Integer.parseInt(values);
                if(num > randomInt)
                {
                    JOptionPane.showMessageDialog(null, "Too High. Guess Again: ");
                }else if(num < randomInt)
                {
                    JOptionPane.showMessageDialog(null, "Too Low. Guess Again: ");
                }else{
                    JOptionPane.showMessageDialog(null, "Correct! \nNumber of guesses: " + numberGuesses);
                    break;
                }
                numberGuesses++;
            }
        }


        System.exit(0);
    }
}

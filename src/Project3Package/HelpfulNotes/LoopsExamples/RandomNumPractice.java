package Project3Package.HelpfulNotes.LoopsExamples;

import java.util.Random;

public class RandomNumPractice {
    public static void main(String[] args) {

        //********************************** Random Numbers ************************************

        //*********************************** Math.Random() ************************************

        //Double Value Between 0.0(inclusive) and 1.0(exclusive)
        //Syntax --> Math.random()
        //Example of it printing a random number:
        double valueOne = Math.random();
        System.out.println("\nUsing Math.random(): \ndouble value = Math.random() return --> " + valueOne);

        /* Program Output:

        Using Math.random():
        double value = Math.random() return --> 0.05564565356 //Random number
         */

        double value = Math.random();
        System.out.println("\nUsing Math.random(): \ndouble value = Math.random() return --> " + value);
        //Range between 1 and 20
        //Syntax --> double valueTwo = Math.random() * 20 + 1; Range = { 0.0 to 20.95 }
        double valueTwo = Math.random() * 20 + 1;
        System.out.println("\nUsing Math.random() * 20 + 1 \nvalueTwo = " + valueTwo);
        //System.out.printf("\nUsing Math.random() * 20 + 1 \nvalueTwo = %.6f ", valueTwo);
        //^^^ Prints out same thing but with only 6 numbers after decimal point  ^^^

        /* Program Output:
        Using Math.random():
        double value = Math.random() return --> 0.54545315331564

        Using Math.random() * 20 + 1
        valueTwo = 11.1156454554537
         */

        //******* Integers *******

        // Casting (int)
        //Syntax --> int randomInt = (int) (Math.random() * (max - min) + min);
        int randomInt = (int) (Math.random() * (40 - 2) + 2);
        System.out.println("\nUsing (int)Math.random() * (40 - 2) + 2 \nrandomInt = " + randomInt);
        //System.out.printf("\nUsing (int)Math.random() * (40 - 2) + 2 \nrandomInt = %d ", randomInt);
        // ^^^ Another way to print out the same thing ^^^

        /* Program Output:
        Using (int)Math.random() * (40 - 2) + 2
        randomInt = 39
         */

        //******************************* Random random = new Random() *****************************

        //Need to import random from java.util at top
        Random x = new Random();


        System.exit(0);



    }
}

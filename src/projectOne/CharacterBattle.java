package projectOne;

import java.util.Scanner;

public class CharacterBattle {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //Declare variables
        int numberRounds = 0;
        String name;
        int hitPoints = 0;
        String moveName;
        int movePower = 0;
        int attackSpeed = 0;
        int players = 2;


        //Ask the player to enter an odd number of rounds
        System.out.println("Enter an odd number of rounds:");
        numberRounds = Integer.parseInt(keyboard.nextLine());


        for (int i = 1; i <= numberRounds; i++){

            //Reset stats
            hitPoints = 0;
            movePower = 0;
            attackSpeed = 0;

            System.out.printf("\nRound %d : \n------------------------------\n", i);

            //Use for loop to iterate through stats
            for (int j = 1; j <= players; j++) {

                System.out.printf("Player %d: Select a character and enter its stats", j);

                //Prompt the player to enter stats
                System.out.printf("\nEnter name:\n", j);
                name = String.format(keyboard.nextLine());

                System.out.printf("Enter HP:\n", j);
                hitPoints = Integer.parseInt(keyboard.nextLine());

                System.out.printf("Enter move name:\n", j);
                moveName = String.format(keyboard.nextLine());

                System.out.printf("Enter move's power:\n", j);
                movePower = Integer.parseInt(keyboard.nextLine());

                System.out.printf("Enter attack speed:\n", j);
                attackSpeed = Integer.parseInt(keyboard.nextLine());

                //TEST Use for loop to display stats
                System.out.printf("\nPlayer %d: name: %s HP: %d move name: %s move power: %d attack speed: %d\n", j, name, hitPoints, moveName, movePower, attackSpeed );


            }


        }
















    }
}

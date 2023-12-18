package Project3Package.HelpfulNotes;

import java.util.Random;
import java.util.Scanner;

public class CharacterBattle {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //Declare variables
        int numberRounds = 0;
        String p1Name;
        int p1HitPoints = 0;
        String p1MoveName;
        int p1MovePower = 0;
        int p1AttackSpeed = 0;

        int players = 2;

        String p2Name;
        int p2HitPoints = 0;
        String p2MoveName;
        int p2MovePower = 0;
        int p2AttackSpeed = 0;

        int p1WinPointTotal = 0;
        int p2WinPointTotal = 0;

        int p1PointLoss;
        int p2PointLoss;


        //Ask the player to enter an odd number of rounds
        System.out.println("Enter an odd number of rounds:");
        numberRounds = Integer.parseInt(keyboard.nextLine());


        for (int i = 1; i <= numberRounds; i++) {

            //Reset stats
            p1HitPoints = 0;
            p1MovePower = 0;
            p1AttackSpeed = 0;

            p1HitPoints = 0;
            p1MovePower = 0;
            p1AttackSpeed = 0;

            System.out.printf("\nRound %d : \n------------------------------\n", i);

            System.out.println("Player 1: Select a character and enter its stats");

            //Prompt the player to enter stats
            System.out.println("Enter name:");
            p1Name = keyboard.nextLine();

            System.out.println("Enter HP:");
            p1HitPoints = Integer.parseInt(keyboard.nextLine());

            System.out.println("Enter move name:");
            p1MoveName = keyboard.nextLine();

            System.out.println("Enter move's power:");
            p1MovePower = Integer.parseInt(keyboard.nextLine());

            System.out.println("Enter attack speed:");
            p1AttackSpeed = Integer.parseInt(keyboard.nextLine());

            System.out.println("\nPlayer 2: Select a character and enter its stats");

            //Prompt the second player to enter stats
            System.out.println("Enter name:");
            p2Name = keyboard.nextLine();

            System.out.println("Enter HP:");
            p2HitPoints = Integer.parseInt(keyboard.nextLine());

            System.out.println("Enter move name:");
            p2MoveName = keyboard.nextLine();

            System.out.println("Enter move's power:");
            p2MovePower = Integer.parseInt(keyboard.nextLine());

            System.out.println("Enter attack speed:");
            p2AttackSpeed = Integer.parseInt(keyboard.nextLine());

            //TEST Use for loop to display stats
            //System.out.printf("\nPlayer 1: name: %s HP: %d move name: %s move power: %d attack speed: %d\n Player 2: name: %s HP: %d move name: %s move power: %d attack speed: %d\n\n", name, hitPoints, moveName, movePower, attackSpeed, name2, hitPoints2, moveName2, movePower2, attackSpeed2 );

            //Use speed to determine which character strikes first

            //IF Player 1's character has higher speed
            if (p1AttackSpeed > p2AttackSpeed) {

                //Player 1's turn is first
                p2HitPoints = p2HitPoints - p1MovePower;
                if (p2HitPoints <= 0) {
                    System.out.printf("Player 1 %s wins this round!", p1Name);
                    p1WinPointTotal = p1WinPointTotal + 1;
                }

                //Player 2's turn is second
                p1HitPoints = p1HitPoints - p2MovePower;
                if(p1HitPoints <= 0){
                    System.out.printf("Player 2 %s wins this round!", p2Name);
                    p2WinPointTotal = p2WinPointTotal + 1;
                }
            }

            //IF Player 2's character has higher speed
            else if (p2AttackSpeed > p1AttackSpeed) {

                //Player 2's turn is first
                p1HitPoints = p1HitPoints - p2MovePower;
                if (p1HitPoints <= 0) {
                    System.out.printf("Player 2 %s wins this round!", p2Name);
                    p2WinPointTotal = p2WinPointTotal + 1;
                }

                //Player 1's turn is second
                p2HitPoints = p2HitPoints - p1MovePower;
                if (p2HitPoints <= 0) {
                    System.out.printf("Player 1 %s wins this round!", p1Name);
                    p1WinPointTotal = p1WinPointTotal + 1;
                }
                //IF both players speeds are equal
            } else {
                    Random random = new Random();
                    int randomNumber;
                    randomNumber = random.nextInt(2);

                    //IF random number is 0 Player 1 goes first
                    if (randomNumber == 0){

                        //Player 1's turn is first
                        p2HitPoints = p2HitPoints - p1MovePower;
                        if (p2HitPoints <= 0) {
                            System.out.printf("Player 1 %s wins this round!", p1Name);
                            p1WinPointTotal = p1WinPointTotal + 1;
                        }

                        //Player 2's turn is second
                        p1HitPoints = p1HitPoints - p2MovePower;
                        if(p1HitPoints <= 0){
                            System.out.printf("Player 2 %s wins this round!", p2Name);
                            p2WinPointTotal = p2WinPointTotal + 1;
                        }
                    }

                    //IF random number is 1 Player 2 goes first
                    //if (randomNumber == 1){
                    //Player 2's turn is first
            else {
                        p1HitPoints = p1HitPoints - p2MovePower;
                        if(p1HitPoints <= 0){
                            System.out.printf("Player 2 %s wins this round!", p2Name);
                            p2WinPointTotal = p2WinPointTotal + 1;
                        }

                        //Player 1's turn is second
                        p2HitPoints = p2HitPoints - p1MovePower;
                        if (p2HitPoints <= 0) {
                            System.out.printf("Player 1 %s wins this round!", p1Name);
                            p1WinPointTotal = p1WinPointTotal + 1;
                        }
                    }
                }

                //Print out which player has the highest number of wins

                //IF Player 1 has the highest number of wins
                if (p1WinPointTotal > p2WinPointTotal){
                    System.out.println("Player 1 wins the battle!");
                } else {
                    System.out.println("\nPlayer 2 wins the battle!");
                }




        //Print the final scores
        System.out.printf("\nWins:\nPlayer 1 Wins: %d\nPlayer 2 Wins: %d\n", p1WinPointTotal, p2WinPointTotal);

        }

    //Print out which player has the highest number of wins

    //IF Player 1 has the highest number of wins
    if (p1WinPointTotal > p2WinPointTotal){
        System.out.println("Player 1 wins the battle!");
    }

    //IF Player 2 has the highest number of wins
    if (p2WinPointTotal > p1WinPointTotal){
        System.out.println("Player 2 wins the battle!");
    }


    }
}

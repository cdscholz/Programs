package Project3Package.HelpfulNotes.LoopsExamples;

import javax.swing.*;
import java.util.Scanner;
public class whileLoopPractice {
    public static void main(String[] args) {

        // SYNTAX - WHILE LOOPS
        // while(condition){//code that will be executed}
        // do{//code this is executed at least one time before it check the conditions}while(condition);
        // while(true){if(condition){break;}}


        //**************** WHILE LOOP () ********************

        //Initialized as 0
        int num1 = 0;
        // while(7 <= 6){}
        while(num1 <= 6){
            System.out.println("The number is : " + num1);
            //Increment num
            //num = num + 1;
            //num++;
            num1++;
            //System.out.println("This is number after incrementing " + num);
        }

        //Program Output:
        //The number is : 1
        //The number is : 2
        //The number is : 3
        //The number is : 4
        //The number is : 5
        //The number is : 6


        //**************** DO WHILE LOOP () ********************

        int num2 = 0;
        do{
            //Make sure that the code is executed at least one more time before checking the condition.
            System.out.println("The number is : " + num2);
            num2++;

        }while(num2 <= 6);

        /* Program Output:
        The number is : 0
        The number is : 1
        The number is : 2
        The number is : 3
        The number is : 4
        The number is : 5
        The number is : 6
         */


        //**************** WHILE LOOP () ********************

        while(true){
            String favTVShow = JOptionPane.showInputDialog("Enter your favorite TV show: ");
            //break;
            if(!favTVShow.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Your favorite TV show is " + favTVShow);
                break;
            }else{
                JOptionPane.showMessageDialog(null, "Please enter a valid TV show.");
            }
        }

        //Prompt user
        int x = 7;
        Scanner console = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 10 or enter q to quit");
        while(true){
            String values = JOptionPane.showInputDialog("Guess a number between 1 and 10 or enter q to quit.");
            if(values.equals("q")){
                JOptionPane.showMessageDialog(null, "You quitter!!!");
                break;
            }else{
                int num = Integer.parseInt(values);
                if(num > x){
                    JOptionPane.showMessageDialog(null, "Too High");
                }else if(num < x){
                    JOptionPane.showMessageDialog(null, "Too Low");
                }else{
                    JOptionPane.showMessageDialog(null, "Correct");
                    break;
                }
            }
        }
        System.exit(0);
    }
}

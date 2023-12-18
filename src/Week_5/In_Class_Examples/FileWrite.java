package Week_5.In_Class_Examples;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {

        //Create two instances

        //File
        File outputFile = new File("UserInformation.txt");

        //PrintWriter
        PrintWriter output = new PrintWriter(outputFile);

        //Header
        //%s --> String
        output.printf("%-20s %-20s %-17s %-20s %-20s", "<User Name> ", "<Password> ", "<Score> ", "<Player Character> ", "<Winning Percentage> ");

        //Declare variables
        String Name, passW, playerChar;
        int score;
        double winningPer;

        //PROMPT THE USER
        //2 times
        for(int i = 1; i <= 2; i++){
            //Name, passW, score, playerChar, winningPer
            Name = JOptionPane.showInputDialog(String.format("Enter user %d's user name", i));
            passW = JOptionPane.showInputDialog(String.format("Enter user %d's password: ", i));
            playerChar = JOptionPane.showInputDialog(String.format("Enter user %d's character.", i));
            //Take in score --> Integer
            score = Integer.parseInt(JOptionPane.showInputDialog(String.format("Enter user %d's score ", i)));
            //Take in winning percentage --> Double
            winningPer = Double.parseDouble(JOptionPane.showInputDialog(String.format("Enter user %d's winning percentage: ", i)));
            output.printf("\n%-20s %-20s %6d %23s %15.2f", Name, passW, score, playerChar, winningPer);
            // |Name            |Password              |                99|                 BladeRunner|               76.55|
        }

        //Close out
        output.close();

        /* Program Output:
        Prompts user to enter string/integer values

        <User Name>         <Password>          <Score>             <Player Character>              <Winning Percentage>
        RobinHood45         123@#$abc             99                  BladeRunner                          99.56
        jakleHyde44         nfewi73fh             34                  ghostGrl                             89.65
         */



    }
}

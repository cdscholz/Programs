package Week_5.In_Class_Examples;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend {
    public static void main(String[] args) throws IOException {

        //try{}catch(){}
        try {

            //Create 2 instances

            //FileWriter
            //FileWriter --> (".txt", true)
            FileWriter filewrite = new FileWriter("UserInformation.txt", true);

            //PrintWriter
            PrintWriter output = new PrintWriter(filewrite);

            //Declare variables and initialize them with the user's input
            String Name = JOptionPane.showInputDialog("Enter user's user name");
            String passW = JOptionPane.showInputDialog("Enter user's password");
            String playerChar = JOptionPane.showInputDialog("Enter user's character");
            int score = Integer.parseInt(JOptionPane.showInputDialog("Enter user's score"));
            double winningPer = Double.parseDouble(JOptionPane.showInputDialog("Enter user's winning percentage"));

            //Writing to file format
            output.printf("\n%-20s %-20s %6d %23s %15.2f", Name, passW, score, playerChar, winningPer);

            //close out
            filewrite.close();
            output.close();

        }catch(FileNotFoundException e)
        {
            System.err.println("*** You file wasn't found. Fix that! ***");
            //e.printStackStrace();
        }



    }
}

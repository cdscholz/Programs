package Week_2.In_Class_Examples;

import javax.swing.JOptionPane;  //Only imports JOptionPane
//import javax.swing.*;         //Imports everything

public class DialogBoxPractice {
    public static void main(String[] args) {

        //Asks your name then prints it
        String name;
        name = JOptionPane.showInputDialog("What is your name?");
        System.out.println(name);

        //Shows a message in popup box
        JOptionPane.showMessageDialog(null, "This is a message dialog.");
        // null is first argument

        //Integer.parseInt(); Converts string name to a value - In Example converts "hours" to a number such as 20
        int hours;
        hours = Integer.parseInt(JOptionPane.showInputDialog("How many hours did you work this week?"));
        System.out.println(hours);

        //This works the same way for doubles by using Double.parseDouble(); instead of Integer.parseInt(); and "double hours" instead of "int hours"
        Double payRate;
        Double grossPay;
        payRate = Double.parseDouble(JOptionPane.showInputDialog("What is your hourly pay rate?"));
        grossPay = hours * payRate;
        JOptionPane.showMessageDialog(null, String.format("Hello %s." +
                "\nYour gross pay is $%.2f",name, grossPay));

        System.exit(0);
        //Always put this at the end of a program using import javax to close it out


    }
}

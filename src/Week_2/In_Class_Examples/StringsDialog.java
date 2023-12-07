package Week_2.In_Class_Examples;

import javax.swing.*;

public class StringsDialog {
    public static void main(String[] args) {

        //STRINGS
        String name = "Robin";

        //.concat() --> Method in String class
        //Changes the string name to "Tilfod" by using name = name.concat
        name = name.concat("Tilfod");
        System.out.println(name);

        //.length() - prints out the length (number of characters) of the string --> Method in String class
        System.out.println(name.length());

        //.charAt() - prints out whatever character is at that place in the string --> Method in String class
        System.out.println(name.charAt(4)); //Prints out whatever character is at the fourth spot in string name

        //.replace() - Finds string parameter and replaces it with "replacement"  --> Method in String class
        System.out.println(name.replace("RobinTilfod", "Jacob"));

        //.substring() - takes name that you have and outputs starting (such as 0 starts at beginning of a string) characters though ending
        System.out.println(name.substring(0)); //prints out entire string
        System.out.println(name.substring(0,1)); //Only prints out the first character of string
        System.out.println(name.substring(0,4)); //prints out first 4 characters of string


        //DIALOG BOX

        //JOption Pane
        // Asks user to enter name and then outputs "You entered: name"
        //F is used in front of name because name is already used previously in program
        String Fname = JOptionPane.showInputDialog("Enter your name:  ");
        JOptionPane.showMessageDialog(null, "You entered: " + Fname);

        //Integer
        //Used for integers
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null,"You entered: " + age);

        //Double
        double gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter your GPA: "));
        JOptionPane.showMessageDialog(null, "You entered: " + gpa);

        //String.format() - To put all of the gpa age name together in a "story" - Format is used with the % stuff (Ex: %d%n)
        String story = String.format("The story of the person blah blah %s%n age: %d%n gpa: %.2f%n" + Fname, age, gpa);
        JOptionPane.showMessageDialog(null, story);






        System.exit(0);

    }
}

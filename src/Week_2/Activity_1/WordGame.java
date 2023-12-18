package Week_2.Activity_1;

import javax.swing.*;

public class WordGame {
    public static void main(String[] args) {
        //JOption Pane
        String Fname = (JOptionPane.showInputDialog("Enter your name: "));
        JOptionPane.showMessageDialog(null,"You entered: " + Fname);

        //integer
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null,"You entered: " + age);

        //double
        //double gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter your gpa: "));
        //JOptionPane.showMessageDialog(null,"You entered: " + gpa);

        String Fcity = (JOptionPane.showInputDialog("Enter what city you live in: "));
        JOptionPane.showMessageDialog(null,"You entered: " + Fcity);

        String Fcollege = (JOptionPane.showInputDialog("Enter what college you attend: "));
        JOptionPane.showMessageDialog(null,"You entered: " + Fcollege);

        String Fmajor = (JOptionPane.showInputDialog("Enter your major: "));
        JOptionPane.showMessageDialog(null,"You entered: " + Fmajor);

        String Fanimal = (JOptionPane.showInputDialog("Enter what kind of pet you have: "));
        JOptionPane.showMessageDialog(null,"You entered: " + Fanimal);

        String Fpet = (JOptionPane.showInputDialog("Enter what your pet's name is: "));
        JOptionPane.showMessageDialog(null,"You entered: " + Fpet);

        //System.out.print(" %d %n %s");
        JOptionPane.showMessageDialog(null, String.format("There once was a person named %s%n who lived in %s%n. At the age of %d%n, %s%n went to college at %s%n. %s%n graduated with %s%n. Then, %s adopted a %s named %s%n. They both lived happily ever after!",Fname,Fcity,age,Fname,Fcollege,Fname,Fmajor,Fname,Fanimal,Fpet));







        //Strings
        String name ="Robin";
        //.concat()
        name.concat("Tilfod");
        System.out.println(name);
        name = name.concat("Tilfod");
        System.out.println(name);
        //.length() --> method in the String class
        System.out.println(name.length());
        //.charAt() --> method in the String class
        System.out.println(name.charAt(4));
        //.replace() --> method in the String class
        System.out.println(name.replace("RobinTilfod", "Jacob"));
        //,substring()
        System.out.println(name.substring(0));
        System.out.println(name.substring(0,1));
        System.out.println(name.substring(0,4));


        System.exit(0);
    }
}

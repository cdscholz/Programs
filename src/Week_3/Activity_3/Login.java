package Week_3.Activity_3;

import javax.swing.JOptionPane;

public class Login {
    public static void main(String[] args) {
//Activity 3 - Even or Odd (Logical Operators Activity)

        String realUserName = "cierra";
        String realPassword = "hello";

        String userName;
        String password;

        //Prompt the user for their username and password
        userName = JOptionPane.showInputDialog("Enter your username:");

        password = JOptionPane.showInputDialog("Enter your password:");

        if (userName == realUserName) {

            if (password == realPassword) {
                JOptionPane.showMessageDialog(null, "Welcome to CS121");

            } else if (password != realPassword) {
                JOptionPane.showMessageDialog(null, "The password you entered is incorrect");

            } else if (userName != realUserName) {

            } else if (password != realPassword) {
                JOptionPane.showMessageDialog(null, "The username and password you entered is incorrect");

            }
            {
                JOptionPane.showMessageDialog(null, "The username you entered is incorrect");

            }


        }






    }
}

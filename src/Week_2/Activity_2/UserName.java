package Week_2.Activity_2;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = console.nextLine();

        //lowerCase
        System.out.println(name.toLowerCase());

        //.toUpperCase()
        System.out.println(name.toUpperCase());

        //Creating an instance or an object of the StringBuilder class
        StringBuilder reverseName = new StringBuilder(name);
        System.out.println(reverseName.reverse());
    }
}

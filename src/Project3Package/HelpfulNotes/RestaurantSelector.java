package Project3Package.HelpfulNotes;

import java.util.Scanner;

public class RestaurantSelector {
    public static void main(String[] args)
    {
//Activity 5 - Restaurant Selector

        // Create an instance of your scanner class
        Scanner console = new Scanner(System.in);
        System.out.println("Is anyone in your party a vegetarian?");
        String vegetarian = console.nextLine();
        System.out.println("Is anyone in your property a vegan?");
        String vegan = console.nextLine();
        System.out.println("Is anyone in your party gluten-free?");
        String glutenFree = console.nextLine();


        System.out.println("Here are your restaurant choices:\n");

        if (vegan.equals("no"))
        {
            System.out.println("Main Street Pizza Company\n");
        }

        if (vegan.equals("no") && glutenFree.equals("no"))
        {
            System.out.println("Mama's Fine Italian\n");
        }

        if (vegan.equals("no") && glutenFree.equals("no") && vegetarian.equals("no"))
        {
            System.out.println("Joe's Gourmet Burgers\n");
        }

        //This works for everyone
        System.out.println("Corner Cafe\n");
        System.out.println("The Chef's Kitchen\n");

    }
}

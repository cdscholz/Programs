package Week_4.loopsActivities.Activity_8;

import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args) {
//Activity 8 - Average Rainfall (Nested for Loops Activity)

        Scanner keyboard = new Scanner(System.in);

        int numberYears;    //Number of years
        int rainfallInches = 0;
        int averageRainfall = 0;
        int numberMonths = 0;

        // Prompt the user for how many years there are
        System.out.println("Enter number of years");
        numberYears = Integer.parseInt(keyboard.nextLine());

        // use for loop to iterate through the years
        for (int i = 1; i <= numberYears; i++) {

            // use for loop to iterate through the months
            for (int j = 1; j < 13; j++) {
                // Prompt the user to enter inches of rainfall
                System.out.printf("Enter inches of rainfall for year %d month %d\n", i, j);
                rainfallInches += Integer.parseInt(keyboard.nextLine());
            }

            //Calculate the number of months being averaged
            numberMonths = numberYears * 12;

            //Calculate the average rainfall
            averageRainfall = rainfallInches / numberMonths;

        }

        System.out.printf("\nNumber of months: %d\nTotal inches of rainfall: %d\nAverage rainfall per month for %d years: %d", numberMonths, rainfallInches, numberYears, averageRainfall);

    }
}

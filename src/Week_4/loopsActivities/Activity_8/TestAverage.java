package Week_4.loopsActivities.Activity_8;

import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        //Activity 8 - Test Average (Nested for Loops Activity)

        Scanner keyboard = new Scanner(System.in);

        int numberStudents;             // Number of students
        int numberTests;                // Number of tests
        int TestScores = 0;
        double averageTestScore = 0;


        // Prompt the user for how many students there are
        System.out.println("Enter number of students: ");
        numberStudents = Integer.parseInt(keyboard.nextLine());

        // Prompt the user for the number of tests
        System.out.println("Enter number of tests: ");
        numberTests = Integer.parseInt(keyboard.nextLine());

        // use for loop to iterate through students
        for (int i = 1; i <= numberStudents; i++)
        {
            //Reset test score
            TestScores = 0;

            System.out.printf("\nStudent number %d \n---------------------\n", i);

            // use for loop to iterate through test scores
            for (int j = 1; j <= numberTests; j++) {
                // Prompt the user to enter test scores
                System.out.printf("Enter score %d: ", j);
                TestScores += Integer.parseInt(keyboard.nextLine());

            }
            //Calculate the average test scores
            averageTestScore = (double)TestScores / numberTests;

            // Use for loop to display average
            System.out.printf("The average for student %d is %.2f\n ", i, averageTestScore);


        }






    }

}


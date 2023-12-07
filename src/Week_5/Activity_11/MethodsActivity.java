package Week_5.Activity_11;

import java.util.Scanner;

public class MethodsActivity {
    //Activity 11 - Methods
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Function calls here

        double length = 0;
        double width = 0;
        double area = 0;

        length = getLength();

        width = getWidth();

        area = getArea(length, width);

        displayData(length, width, area);

        scanner.close();


    }
    public static void displayData(double length, double width, double area){

        System.out.println("rectangle length: " + length + "\nrectangle width: " + width + "\nrectangle area: " + area);

    }

    public static double getArea(double length, double width){

        double area = length * width;

        return area;

    }

    public static double getWidth(){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the width of a rectangle");
        double width = Double.parseDouble(keyboard.nextLine());

        return width;

    }

    public static double getLength(){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the length of a rectangle");
        double length = Double.parseDouble(keyboard.nextLine());

        return length;


    }
}

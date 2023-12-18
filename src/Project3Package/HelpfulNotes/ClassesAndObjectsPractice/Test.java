package Project3Package.HelpfulNotes.ClassesAndObjectsPractice;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //Create an instance of our car class
        Car TeslaModel3 = new Car("Model 3", "White", 5, 270, 2017);
        Car HondaCivic = new Car("Civic", "Black", 5, 1000, 1979);
        Car BMW3Series = new Car("3 Series", "Red", 5, 11111, 2023);
        System.out.println(TeslaModel3.getYears());
        System.out.println(HondaCivic.getYears());
        System.out.println(BMW3Series.getYears());
        System.out.println("-------------------------");




        //Instance of the Scanner class
        //Console --> object //An object is the representation in code of a real world object or concept
        Scanner console = new Scanner(System.in);
        //.nextLine() --> performs an action (behavior)
        //console.nextLine();

        //Create an instance of my car class default
        //Honda is an object
        //Tesla is an object
        Car Honda = new Car();
        Car Tesla = new Car();
        Car BMW = new Car();

        //Object to access my method --> behavior of the Car class
        Honda.honkIfOldCar();

        System.out.println("\nThis is after I set the year of my car to 1979");
        Honda.setYears(1979);
        Honda.honkIfOldCar();

        Tesla.setYears(2020);
        Tesla.honkIfOldCar();

        BMW.setYears(2021);
        BMW.honkIfOldCar();

















    }
}

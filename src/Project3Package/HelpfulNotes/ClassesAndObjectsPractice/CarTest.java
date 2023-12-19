package Project3Package.HelpfulNotes.ClassesAndObjectsPractice;

import Project3Package.HelpfulNotes.ClassesAndObjectsPractice.Car;

import javax.swing.*;

public class CarTest {
    public static void main(String[] args) {

        //OVERLOADING CONSTRUCTORS
        Car fiat500e = new Car("500e", "Fiat", "Red", 4, 0, 2021, true); //mi;les 15,000
        Car toyotaCamry = new Car("Toyota", "Camry", "Blue", 5, 40000, 2020);
        Car KiaSportage = new Car("Kia", "Silver", 5, 30000, 2019);
        Car mcLaren720s = new Car("720s", "McLaren", "Orange", 2, 5000, 2022, false);
        Car Honda = new Car();

        toyotaCamry.setYears(1977);

        String x = "I had this car since I was a child. It belonged to my father.";
        System.out.println(toyotaCamry.honkIfOldCar(x));

        System.out.println("This prints out the mcLaren 720s is older than 1980\n");
        mcLaren720s.honkIfOldCar();

        JOptionPane.showMessageDialog(null, Honda.getMiles()); //Default to 0
        Honda.setMiles(500, false); //EXAMPLE OF OVERLOADING METHOD
        Honda.setElectric(false);                 //SET THE VALUE OF isElectric TO FALSE
        Honda.setMiles(500);                      //EXAMPLE OF OVERLOADING METHOD
        JOptionPane.showMessageDialog(null, Honda.getMiles());





















    }
}

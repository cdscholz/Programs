package Project3Package.HelpfulNotes.ClassesAndObjectsPractice;

import javax.swing.*;

public class Car {

    //Object-Oriented Programing (OOP)
    //Class: Blueprint or template that defines the structure and behavior of objects
    //Member variables (Also known as fields or attributes)
    //"States" --> data or attributes that describe the current properties of an object
    String model, make, color;
    int seats, miles, years;
    boolean isElectric;

    //Constructor
    //Name, no return type, default or initialized, overloading, default constructor
    //Default constructor --> takes no parameters

    /*
    Can also just do this instead of adding parameters:
    public Car(){

    }
    */

    public Car() {
        //"this" keyword
        this.color = "Not Known";
        this.model = "Not Known";
        this.make = "Not Known";
        this.seats = 0;
        this.miles = 0;
        this.years = 0;
        this.isElectric = true;
    }

    //Parameterized constructors
    //Overloading Constructors: MUST have the Same Name, Different Parameter Lists
    //Overloading Constructors: CAN have different access modifiers

    //With all parameters
    public Car(String Model, String Make, String Color, int Seats, int Miles, int Year, boolean Electric) {
        //"this" keyword
        this.model = Model;
        this.make = Make;
        this.color = Color;
        this.seats = Seats;
        this.miles = Miles;
        this.years = Year;
        this.isElectric = Electric;
    }
    //Without Electric
    public Car(String Model, String Make, String Color, int Seats, int Miles, int Year) {
        //"this" keyword
        this.model = Model;
        this.make = Make;
        this.color = Color;
        this.seats = Seats;
        this.miles = Miles;
        this.years = Year;
    }
    //Without Electric, Years
    public Car(String Model, String Make, String Color, int Seats, int Miles) {
        //"this" keyword
        this.model = Model;
        this.make = Make;
        this.color = Color;
        this.seats = Seats;
        this.miles = Miles;
    }
    //Without Electric, Years, Miles
    public Car(String Model, String Make, String Color, int Seats) {
        //"this" keyword
        this.model = Model;
        this.make = Make;
        this.color = Color;
        this.seats = Seats;
    }
    //Without Electric, Years, Miles, Seats
    public Car(String Model, String Make, String Color) {
        //"this" keyword
        this.model = Model;
        this.make = Make;
        this.color = Color;
    }
    //Without Electric, Years, Miles, Seats, Color
    public Car(String Model, String Make) {
        //"this" keyword
        this.model = Model;
        this.make = Make;
    }
    //Without Electric, Years, Miles, Seats, Color, Make
    public Car(String Model) {
        //"this" keyword
        this.model = Model;
    }
    //Without Make and Electric
    public Car(String Model, String Color, int Seats, int Miles, int Year) {
        //"this" keyword
        this.model = Model;
        this.color = Color;
        this.seats = Seats;
        this.miles = Miles;
        this.years = Year;
    }


    //Methods(functions) that operate on those variables
    //"behaviors"
    //Mutator methods

    //GETTERS
    public int getYears() {
        return years;
    }
    public boolean getElectric(){
        return isElectric;
    }
    public int getMiles(){
        return miles;
    }

    //SETTERS
    public void setYears(int year){
        this.years = year;
    }
    public void setElectric(boolean isElectric){
        this.isElectric = isElectric;
    }




    //OVERLOADING METHODS
    //EXAMPLE OF OVERLOADING A METHOD:
    //public void setMiles(int miles) VS. public void setMiles(int miles, boolean isElectric)
    public void setMiles(int miles) {
        if (!isElectric) {    //If it's not electric
            if(miles >= 0) {
                this.miles += miles;
            }
            else {
                JOptionPane.showMessageDialog(null, String.format("Your miles is currently: %d", this.miles));
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "This car has an electric engine");
        }
    }
    public void setMiles(int miles, boolean isElectric){
        if(isElectric){
            this.miles = miles;
            JOptionPane.showMessageDialog(null, String.format("Your current miles are %d", this.miles));
        } else{
            JOptionPane.showMessageDialog(null, "This car does not have an electric engine");
        }
    }






    public void honkIfOldCar() {
        //If the year is < 1980
        if(years < 1980){
            System.out.println("Honk! Honk! This is an old car!!!!!");
        }else{
            System.out.println("This car is not old enough to Honk!!\n Beep Beep!!!");
        }
    }

}


















package Project3Package.HelpfulNotes.AbstractClassesMethodsInterface;

//Abstract class be vehicle
public abstract class Vehicle {

    //Instance variable (fields)
    protected String make;
    protected String model;
    protected String vehicleID;
    protected int year;

    //Default constructor
    //Null or 0
    public Vehicle(){

    }

    //Parameterized constructor
    public Vehicle(String Make, String Model,String vehicleID, int Year){
        this.make = Make;
        this.model = Model;
        this.vehicleID = vehicleID;
        this.year = Year;
    }

    //Setters and Getters
    //Include my Abstract Method
    //Method signature
    public abstract void displayDetails();
















}

package Project3Package.HelpfulNotes.AbstractClassesMethodsInterface;

import Project3Package.HelpfulNotes.AbstractClassesMethodsInterface.UserInteractable;

//Subclasses
// 'keyword' --> extends
public class Dealership extends Vehicle implements UserInteractable {
    private String dealershipName;
    private String location;

    //Default constructor
    public Dealership(){

    }

    //Parameterized Constructor
    public Dealership(String make, String model, String vehicleID, int year, String dealershipName, String locaion) {
        super(make, model, vehicleID, year);
        this.dealershipName = dealershipName;
        this.location = locaion;
    }

    //Implementing the abstract method
    @Override
    public void displayDetails(){
        System.out.println(String.format("Dealership: %s%nLocation: %s%n***************** Dealership Information ***************** \nMake: %s%nModel: %s%nVehicleID: %s%nYear: %d%n", dealershipName, location, make, model, vehicleID, year));
    }

    //Implement the abstract methods from the interface
    /* void register();
    void login();
    void sendMessage(String message);
    void viewProfile();
     */
    @Override
    public void register(){
        System.out.println("You have registered for a profile. You will have confirmation in 24-48 hours.");
    }

    @Override
    public void login(){
        System.out.println("Login Successful");
    }

    @Override
    public void sendMessage(String message){
        System.out.println("User Message: " + message);
    }

    @Override
    public void viewProfile(){
        System.out.println("You can now view your profile");
    }














}

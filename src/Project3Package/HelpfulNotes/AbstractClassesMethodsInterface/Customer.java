package Project3Package.HelpfulNotes.AbstractClassesMethodsInterface;

//Subclasses
// 'keyword' --> extends
public class Customer extends Vehicle {

    //Fields/Variables
    private String name;
    private String contactInfo;
    private String password;

    //Default constructor
    public Customer(){

    }

    public Customer(String make, String model, String vehicleID, int year, String name, String contactInfo, String password){
        super(make, model, vehicleID, year);
        this.name = name;
        this.contactInfo = contactInfo;
        this.password = password;
    }

    @Override
    public void displayDetails(){
        System.out.println(String.format("Customer: %s%nContact Information: %s%nPassword: %s%n***************** Car Information ***************** \nMake: %s%nModel: %s%nVehicleID: %s%nYear: %d%n", name, contactInfo, password, make, model, vehicleID, year));
    }











}

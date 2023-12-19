package Project3Package.HelpfulNotes.AbstractClassesMethodsInterface;

public class TestAbstractMethod {
    public static void main(String[] args) {

        Customer Lila = new Customer("Honda", "Civic", "123654", 2021, "Lila P.", "lilaPiony@gmail.com", "1@ebfuu*");
        Lila.displayDetails();

        Dealership HondaFordAnderson = new Dealership("Tesla", "X", "11111114444", 2023, "HondaFord", "Anderson");
        HondaFordAnderson.displayDetails();
        HondaFordAnderson.register();
        HondaFordAnderson.login();
        HondaFordAnderson.viewProfile();
        HondaFordAnderson.sendMessage("I forgot my login information. How can I reset my information?");
















    }
}

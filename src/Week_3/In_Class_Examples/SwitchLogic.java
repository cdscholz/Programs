package Week_3.In_Class_Examples;

import javax.swing.*;

public class SwitchLogic {
    public static void main(String[] args) {

    // Switch Statements vs Switch Expressions

        //Switch Statement Example
        String planet = JOptionPane.showInputDialog(null, "Enter a planet:");
        String planetInfo = "";
        switch(planet) {
            case "Earth":
                planetInfo = "Where we live now!";
                break;
            case "Mars":
                planetInfo = "This is known as the red planet!";
                break;
            case "Venus":
                planetInfo = "You entered in Venus";
                break;
            default:
                planetInfo = "There is no info, in this program, for the planet you entered.";
                break;
        }
JOptionPane.showMessageDialog(null, planetInfo);

        //Switch Expression Example (Same results as switch statement just done differently)
        String planetExpress = JOptionPane.showInputDialog("Enter a planet");
        String planetInfoExpress = switch(planetExpress) {
            case "Earth" -> "This is where you live.";
            case "Mars" -> "This is known as the red planet";
            case "Venus" -> "You entered Venus.";
            default -> "There is no info for this planet";
        };



        
    }
}

package Week_5.In_Class_Examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {

        //Create an instance of the File class

        //Absolute Path
        File fileOne = new File("UserInformation.txt");

        //try{}catch()
        try {
        //Relative Path
        Scanner console = new Scanner(fileOne);

        //Reading header
        String header = console.nextLine();
        System.out.printf("%s", header);

        while(console.hasNextLine()){
            String Name = console.next();
            String passW = console.next();
            int score = Integer.parseInt(console.next());
            String playerChar = console.next();
            double winningPer = Double.parseDouble(console.next());

            //Printing
            System.out.printf("\n%-20s %-20s %6d %23s %15.2f%%", Name, passW, score, playerChar, winningPer);
        }
        //Close out
        console.close();

        /* Option 2 from //Relative Path
          File fileTwo = new File("/Users/Cierra/OneDrive - Ball State University/Computer Science 2/Comp Sci 2 12-1-23/Programs Previous\\ESPGame");
        //try{}catch(){}
        Scanner console = new Scanner(fileOne);
        String header = console.nextLine();
        while (console.hasNextLine()) {
            //Variables
            String Line = console.nextLine();
            System.out.println(Line);
        }
         */

    }catch(FileNotFoundException e) {
            e.printStackTrace();

        }


    }
}

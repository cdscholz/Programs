package Week_4.loopsActivities.Activity_6;

import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args)
    {

        //************* Activity 6 - Hotel occupancy (for loop activity) ****************

        //Creating an instance of the scanner class
        Scanner keyboard = new Scanner(System.in);

        int floors;                     // # of rooms in the hotel
        int totalRooms = 0;             // Total # of rooms in the hotel
        int totalOccupiedRooms = 0;     // Total number of occupied rooms
        int totalVacantRooms;           // Total number of vacant rooms
        double occupancyRate;           // Occupancy rate as a decimal

        // Prompt the user for how many floors are in the hotel
        System.out.println("How many floors does the hotel have? ");
        floors = Integer.parseInt(keyboard.nextLine());

        // Use for loop to iterate through the hotel
        for(int i = 1 ; i <= floors ; i++){
            // Prompt the user to enter the number of rooms on the current floor
            System.out.printf("Enter the number of rooms on floor %d%n", i);
            int rooms = Integer.parseInt(keyboard.nextLine());

            // Prompt user to enter number of occupied rooms
            System.out.println("How many rooms are occupied?");
            int occupiedRooms = Integer.parseInt(keyboard.nextLine());

            // Update the totals
            totalRooms = totalRooms + rooms;
            // ^^^ Can also be written as | totalRooms += rooms; | ^^^
            totalOccupiedRooms = totalOccupiedRooms + occupiedRooms;
        }
        // Calculate the total vacant rooms
        totalVacantRooms = totalRooms - totalOccupiedRooms;

        // Calculate occupancy rate --> as a decimal
        occupancyRate = (double)totalOccupiedRooms / totalRooms;

        // Display the hotel occupancy information
        System.out.printf("Floors: %d%nRooms: %d%nOccupied Rooms: %d%nVacant Rooms: %d%nOccupancy Rate: %.2f (%d%%) ", floors, totalRooms, totalOccupiedRooms, totalVacantRooms, occupancyRate, (int)(occupancyRate * 100));

        System.exit(0);

    }
}

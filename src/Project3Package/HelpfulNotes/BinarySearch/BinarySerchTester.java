package Project3Package.HelpfulNotes.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySerchTester {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        BinarySearchDemo = new BinarySearchDemo();
        //int[] array = {23, 17, 12, 90, 84, 38, 5, 77, 44};
        ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(23, 17, 12, 90, 84, 38, 5, 77, 44));

        System.out.println("unsorted: ");
        for (int num : array)
            System.out.println(num + " ");
        System.out.println();

        //sort array
        ArrayList<Integer> sortedArray = selectionSort(array);

        System.out.println("sorted: ");
        for (int num : sortedArray)
            System.out.println(num + " ");
        System.out.println();

        //Search for number
        System.out.println("What number would you like to search for?");
        int key = Integer.parseInt(console.nextLine());

        int found = demo.binarySearch(key, sortedArray);
        if (found == -1) {
            System.out.println("Item not found.");
        } else {
            System.out.printf("Item found at index %d, position %d", found, found + 1);
        }
    }


    //MOD *****
    //public static int[] selectionSort(int[] unsortedArray)
    public static ArrayList<Integer>selectionSort(ArrayList<Integer> unsortedArray)
    {
        //int[] sortedArray = unsortedArray;
        //Mod ***
        ArrayList<Integer> = sortedArray;

        //for (int i = 0; i < sortedArray.length; i++)
        //MOD ***
        for (int i = 0; i < sortedArray.size() - 1; i++)
        {
            int min = i;
            //for (int j = i + 1; j < sortedArray.length; j++)
            //MOD ****
            for (int j = i + 1; j < sortedArray.size() - 1; j++)
            {
                if (sortedArray[j]) < sortedArray[min];
                {
                    min = j;
                }
            }
            int temp = sortedArray[i];
            sortedArray[min] = temp;
        }
        return sortedArray;
    }



































}

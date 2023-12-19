package Project3Package.HelpfulNotes.BinarySearch;

public class BinarySearchDemo {
    public int binarySearch (int key, int[] array) {

        int counter = 0; //Keeps track of comparisons
        int low = 0;
        int high = array.length - 1;
        int mid = (low + high) / 2;

        while (low <= high && array[mid] != key)
        {
            if (array[mid] < key) { //If mid is less than key...
                low = mid + 1; //Low is reset to position after key
            }
            else // If mid is greater than key
            {
                high = mid - 1; //High is reset to position before key
            }
            mid = (low + high) / 2; //Mid is reset to mid between new low/high
            System.out.println("comparison: " + ++counter);
        }

        if (low > high) //If not found
        {
            mid = -1;
        }
        return mid;
























    }
}

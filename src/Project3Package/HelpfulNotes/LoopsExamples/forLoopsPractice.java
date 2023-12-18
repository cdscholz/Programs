package Project3Package.HelpfulNotes.LoopsExamples;

public class forLoopsPractice {
    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4, 5};
        //for(initialization; condition; incrementing or decrementing) {//block of code that we want to execute}
        // int n = 0 ; n < 5; n++(n = n + 1)
        // n = 0 --> prints 1 --> n = 1
        // n = 1 --> prints 2 --> n = 2
        // n = 2 --> prints 3 --> n = 3
        // n = 3 --> prints 4 --> n = 4
        // n = 4 --> prints 5 --> n = 5
        // n = 5 --> FALSE    --> Break Out Of The For Loop.   (5 is not less than 5)
        for(int n = 0; n < numbers.length; n++) {
            System.out.println(numbers[n]);
        }
        /* Output:
            1
            2
            3
            4
            5
         */

        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        /* Output:
            1
            2
            3
            4
            5
            6
            7
            8
            9
            10
         */

        // Print out only even numbers
        for(int i = 1; i < 11; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
        /* Output:
            2
            4
            6
            8
            10
         */

        System.exit(0);

    }
}

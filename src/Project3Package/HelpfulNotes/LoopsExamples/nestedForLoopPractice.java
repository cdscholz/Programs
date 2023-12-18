package Project3Package.HelpfulNotes.LoopsExamples;

public class nestedForLoopPractice {
    public static void main(String[] args) {

        //***************** Nested For Loops *******************

        for(int i = 0; i < 4; i++){
            System.out.println("This is i: " + i + "\n");
            for(int j = 0; j < 5; j++){
                System.out.println("This is j: " + j);
            }
        }

        /* Program Output:
        This is i: 0

            This is j: 0
            This is j: 1
            This is j: 2
            This is j: 3
            This is j: 4
        This is i: 1
        */

        //************** More Complex Nested For Loop ***************

        //2D Array
        int[][] matrix = {
                {11,22,33},
                {45,54,65},
                {78,87,97}
        };
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }

        /* Program Output:
        11
        22
        33

        45
        54
        65

        78
        87
        97
         */

        //************ Generating Patterns Using Nested For Loop *************

        int n = 7;
        //Outer For Loop
        for(int i = 0; i < n; i++){
            //Inner For Loop
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        /* Program Output:
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
         */

        //********* Generate Combinations or Permutations of Elements *********

        //All possible pairs(or combinations)
        int [] numbers = {1,2,3,4};

        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                System.out.println(numbers[i] + " , " + numbers[j]);
            }
        }

        /* Program Output:
        1 , 2
        1 , 3
        1 , 4
        2 , 3
        2 , 4
        3 , 4
         */


    }
}

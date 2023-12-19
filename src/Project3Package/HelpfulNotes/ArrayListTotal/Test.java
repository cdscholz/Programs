package Project3Package.HelpfulNotes.ArrayListTotal;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        //USING ARRAYLISTS
        String presentStudentOriginal [] ={"Alice J.", "Bob S.", "Charlie B.", "Diana G.", "Issac C."};
        int score [] = {1, 2, 3, 4, 45};
        double gpa [] = {3.4, 3.4, 4.0};
        char letterGrade [] = {'A', 'B', 'C', 'D'};

        //Created an instance of my ArrayList class
        ArrayList<String> allStudents = new ArrayList<String>();
        ArrayList<Integer> scores = new ArrayList<Integer>();
        ArrayList<Double> GPA = new ArrayList<Double>();
        ArrayList<Character> LetterGrade = new ArrayList<Character>();


        //For each loop
        for (String student: presentStudentOriginal){
            allStudents.add(student);
        }

        //Later
        allStudents.add("Ronald H."); //2:10pm
        allStudents.add("Robin D.");  //2:15pm
        allStudents.add("Kevin G.");  //2:45p,

        /* presentStudents.add("Alice J.");
        presentStudents.add("Bob S.");
        presentStudents.add("Charlie B.");
        presentStudents.add("Diana G.");
        presentStudents.add("Issac C."); */



        /* Using Array X
        Class Start at 2:00pm
        String presentStudents [] = new String [5]; //Array Size if fixed at 2:00pm
        String presentStudent2 [] = {"Alice J.", "Bob S.", "Charlie B.", "Diana G.", "Issac C."}
        presentStudents[0] = "Alice J.";
        presentStudents[1] = "Bob S.";
        presentStudents[2] = "Charlie B.";
        presentStudents[3] = "Diana G.";
        presentStudents[4] = "Issac C.";
         */


















    }
}

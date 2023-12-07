package Week_3.In_Class_Examples;

public class Conditionals {
    public static void main(String[] args) {

        /*
        Conditional Statements:
            - if statements
            - else-if statements
            - else statements
            -switch statements
         */

        /*
        if(condition) {
            //executes the code if the condition is true.
        }

        //else statement
        if(condition) {
            //executes the code if the condition is true.
        }
        else {
            //executes the code if the condition is false
        }

        //if-else-if statements
        if (condition1) {
            //executes the code if condition1 is true.
        }
        else if(condition2) {
            //executes the code if condition2 is true.
        }
        else if(condition3) {
            //executes the code if condition3 is true.
        }
        else {
            //Executes the code if the above conditions are not met.
        }
        */

        //EXAMPLES

        //Declared Variables for Examples:
        int age;
        double gpa;
        char letterGrade;
        boolean csMajor, isStudent, isTeacherCsMajor, isNotCsMajor, isTeacher;
        String name;
        //Initialize Variable for Examples:
        age = 1;
        gpa = 3.9;
        letterGrade = 'A';
        isStudent = false;
        csMajor = true;
        name = "Ladelle";
        isTeacher = true;
        isTeacherCsMajor = true;
        isNotCsMajor = false;

        //if and else statement
        if(age <= 21) {
            System.out.println("You are 21 or younger. \n");
        }
        else {
            System.out.println("you are older than 21. \n");
        }

        //if-else-if
        if(gpa >= 4.0) {
            System.out.println("You recieve an A");
        }
        else if(gpa >= 3.6) {
            System.out.println("You recieve an A -----");
        }
        else if(gpa >= 2.7) {
            System.out.println("You recieve a B");
        }
        else if(gpa >= 1.7) {
            System.out.println("You recieve a C");
        }
        else {
            System.out.println("You recieve below a C");
        }

        //Relational Operators
        // (Ex: <, >, <=, >=, ==(Equivalent(Equal)), !=(Not Equivalent(Equal))
        //.equals --> for Strings
        if(csMajor == isStudent) {
            System.out.println("This person is a student and a cs Major");
        }
        else
        {
            System.out.println("One of the values for the student or cs major is false. ");
        }
        //.equals example
        name = "Ladelle";
        String name2 = "LaDelle";
        if(name.equals(name2)) {
            System.out.printf("The name %s is equal to name2 %s", name, name2);
        }
        else {
            System.out.println("The names are not equal");
        }
        //Would not be equal because of the D capitalized in name2
        //"!=" Example Below  (! means "not") - so basically not equals
        name = "Ladelle";
        String Name2 = "LaDelle";
        if(!name.equals(name2)) {
            System.out.printf("The name %s is not equal to name2 %s", name, name2);
        }
        else {
            System.out.println("The names are equal");
        }


        if(csMajor == isStudent) {
            System.out.println("This person is a student and a cs Major");
        }
        else
        {
            if(isTeacher != isStudent)
            {
                System.out.println("This is a teacher and may be a cs major");
            }
            else if(isTeacher == isTeacherCsMajor) {
                System.out.println("This is a teacher and a cs major");
            }
            System.out.println("One of the values for the student or cs major is false. ");
        }











        
    }
}

package Project3Package.HelpfulNotes.StacksandQueues;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        Stack<String> CDs = new Stack<>();
        //Add an item to the stack
        //.push()
        CDs.push("Empire of the Sun Celebrate");
        CDs.push("Oh My my");
        CDs.push("Glory Sound Prep");
        CDs.push("Manic");
        CDs.push("The Great Gatsby");

        System.out.println(CDs);
        System.out.println("See the last item added");
        //.peek()
        System.out.println(CDs.peek());

        System.out.println("Is the stack empty?");
        //isEmpty()
        System.out.println(CDs.isEmpty());

        //Remove items from stack
        System.out.println("Remove 3 items from my stack");
        CDs.pop();
        CDs.pop();
        CDs.pop();

        System.out.println("After the removal of 3 items what is on top?");
        System.out.println(CDs.peek());













    }
}

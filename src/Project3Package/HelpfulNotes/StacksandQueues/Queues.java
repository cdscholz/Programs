package Project3Package.HelpfulNotes.StacksandQueues;

import java.util.LinkedList;
import java.util.Queue;
public class Queues {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(7);
        queue.add(9);
        queue.add(17);
        queue.add(27);
        queue.add(37);
        queue.add(77);

        System.out.println(queue);
        //Check size
        //.size()
        System.out.println(queue.size());
        //.peek()
        System.out.println(queue.peek());
        //.remove()
        queue.remove();
        queue.remove();
        System.out.println(queue.peek());
        //.isEmpty()
        System.out.println(queue.isEmpty());

        //.offer()
        System.out.println(queue.offer(11));
        System.out.println(queue);
        //.poll()
        System.out.println(queue.poll());
        System.out.println(queue);
        //.element
        System.out.println(queue.element());
        System.out.println(queue);
















    }
}

package QueueWork;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueWork {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Tom");
        queue.add("Jack");
        queue.add("Bob");
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue);
    }
}

package QueueWork;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeWork {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(5);
        deque.add(3);
        deque.addLast(7);
        deque.offerFirst(9);
        deque.offerLast(10);
        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque);
//        System.out.println(deque.pollFirst());
        System.out.println(deque.peekFirst());
        System.out.println(deque.getLast());
    }
}

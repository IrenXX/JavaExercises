package ThreadWork2;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueMethod {
    public static void main(String[] args) {

        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(4);
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        System.out.println(queue);

        //Producer
        new Thread(() -> {
            int i = 0;
            while (true) {
                try {
                    queue.put(++i);
                    System.out.println("Producer insert " + i + " " + queue);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        //Consumer
        new Thread(() -> {
            while (true) {
                try {
                    Integer j = queue.take();
                    System.out.println("Consumer drop " + j + " " + queue);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

    }
}

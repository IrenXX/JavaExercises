package ThreadWork;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerPattern {
    private static BlockingQueue<Integer> blockingDeque = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }

    static void produce() throws InterruptedException {
        Random random = new Random();
        while (true) {
            Thread.sleep(100);
            blockingDeque.put(random.nextInt(100));
        }
    }

    static void consume() throws InterruptedException {
        while (true){
            Thread.sleep(1000);
            System.out.println(blockingDeque.take());
            System.out.println("Queue size: "+blockingDeque.size());
        }
    }
}

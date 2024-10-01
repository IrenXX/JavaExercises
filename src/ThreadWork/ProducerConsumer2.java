package ThreadWork;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer2 {

    public static void main(String[] args) throws InterruptedException {
        WorkConsumerProducer pc = new WorkConsumerProducer();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
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

}

class WorkConsumerProducer {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 10;
    private final Object lock = new Object();

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (lock) {
                while (queue.size() == LIMIT) {
                    lock.wait(); //вызывается в пределах синхронизованного блока
                }
                queue.offer(value++);
                System.out.println("Producer thread started...");
                lock.notify();
            }
        }
    }

    public void consume() throws InterruptedException {
//        Thread.sleep(2000);
//        Scanner scanner = new Scanner(System.in);

        while (true) {
            synchronized (lock) {
                while (queue.isEmpty()) {
                    lock.wait();
                }

                int value = queue.poll();
                System.out.println("consumer value" + value);
                System.out.println(queue.size());
                lock.notify();
            }
            Thread.sleep(1000);
        }
    }
}
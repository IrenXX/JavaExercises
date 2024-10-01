package ThreadWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadTest2 {
    private int count;

    public static void main(String[] args) throws InterruptedException {
//        ThreadTest2 test = new ThreadTest2();
//        test.doWork();

        new Worker().main();
    }

    public void doWork() throws InterruptedException {
        Runnable runnable = () ->
        {
            for (int i = 0; i < 10000; i++)
                increment(); //count++;
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        thread1.join(); //ожидание завершения потока в потоке main потока thread1
        thread2.join();
        System.out.println(count);
    }

//    private synchronized void increment() { //только на методах вызывается - this - объект синхронизации
//        count++;
//    }

    //синхронизированный блок - указываем внутри объект синхронизации
    private void increment() {
        synchronized (this) {
            count++;
        }
    }
}

class Worker {
    Object lock1 = new Object();
    Object lock2 = new Object();

    Random random = new Random();
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    void addToList1() throws InterruptedException {
        synchronized (lock1) {
            Thread.sleep(10);
            list1.add(random.nextInt(100));
        }
    }

    void addToList2() throws InterruptedException {
        synchronized (lock2) {
            Thread.sleep(10);
            list2.add(random.nextInt(100));
        }
    }

    public void work() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            addToList1();
            addToList2();
        }
    }

    public void main() throws InterruptedException {
        long before = System.currentTimeMillis();

        Runnable runnable = () -> {
            try {
                work();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        long after = System.currentTimeMillis();
        System.out.println("Time between start and end took " + (after - before) + " ms");
        System.out.println(list1.size());
        System.out.println(list2.size());
    }
}
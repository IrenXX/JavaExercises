package ThreadWork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreWork {
    public static void main(String[] args) throws InterruptedException {

//        Semaphore semaphore = new Semaphore(3); //кол-во разрешений для потоков
//
//        semaphore.acquire();//когда в потоке начинаем взаимодействовать с ресурсом
//        //semaphore.release();//когда в потоке заканчиваем работу с ресурсом
//        System.out.println(semaphore.availablePermits());//количество разрешений которые свободны
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ConnectionWork connection = ConnectionWork.getConnection();
        for (int i = 0; i < 10; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.doWorkWithSemaphore();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);

    }
}

class ConnectionWork {
    private static final ConnectionWork connectionWork = new ConnectionWork();
    private int countConnection;
    private Semaphore semaphore = new Semaphore(3);

    private ConnectionWork() {
    }

    public static ConnectionWork getConnection() {
        return connectionWork;
    }

    public void doWorkWithSemaphore() throws InterruptedException {
        semaphore.acquire();
        doWork();
        semaphore.release();
    }

    private void doWork() throws InterruptedException {
        synchronized (this) {
            countConnection++; //полезная работа с сервером
            System.out.println(countConnection);
        }
        Thread.sleep(3000);

        synchronized (this) {
            countConnection--;
        }
    }
}
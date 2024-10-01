package ThreadWork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolWork {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2); //пул потоков

        for (int i = 0; i < 5; i++) {
            executorService.submit(new Work(i));//выдача заданий для организации потоков
        }

        executorService.shutdown();//начало выполнения потоками заданий
        System.out.println("All tasks submitted");
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}

class Work implements Runnable {
    private final int id;
    public Work(int id) {
        this.id = id;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Slept 0,5 second" + " + Work completed id: " + id);
    }
}
package ThreadWork;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableWork {
    public static void main(String[] args) {
        Future<Integer> submit = null;
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 3; i++) {
            submit = executorService.submit(() -> {
                System.out.println("Starting");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Finished");
                Random random = new Random();
                return random.nextInt(10);
            });
        }

        executorService.shutdown();
        try {
            Integer future = submit.get();
            System.out.println("Value from thread " + future);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}

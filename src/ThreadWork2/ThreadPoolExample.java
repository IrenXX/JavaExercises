package ThreadWork2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Создаем ExecutorService с фиксированным количеством потоков (например, 5)
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Подаем задания на выполнение
        for (int i = 0; i < 10; i++) {
            executor.execute(new Task(i));
        }

        // Завершаем работу пула потоков после того, как все задания выполнены
        executor.shutdown();
    }
}

class Task implements Runnable {
    private int taskId;

    public Task(int id) {
        this.taskId = id;
    }

    @Override
    public void run() {
        System.out.println("Task #" + taskId + " is running");
    }
}

package ThreadWork2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadCollection {
    public static void main(String[] args) throws InterruptedException {

        List<Integer> source = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            source.add(i);
        }
//        List<Integer> target = new ArrayList<>();
        List<Integer> threads =
                Collections.synchronizedList(new ArrayList<>());
        Runnable runnable = () -> {
            threads.addAll(source);
        };
        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
        System.out.println(threads);
    }
}

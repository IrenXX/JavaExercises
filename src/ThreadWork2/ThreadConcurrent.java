package ThreadWork2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ThreadConcurrent {
    public static void main(String[] args) throws InterruptedException {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        List<Integer> synhList = Collections.synchronizedList(list);

        Runnable runnable = () -> {
            synchronized (synhList) {
                Iterator<Integer> iterator = synhList.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        };
        Runnable runnable1 = () -> {
            synhList.remove(10);
        };
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();
        System.out.println(synhList);

    }
}

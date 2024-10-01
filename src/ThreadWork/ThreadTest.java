package ThreadWork;

import java.util.Scanner;

public class ThreadTest {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

//        MyThread myThread2 = new MyThread();
//        myThread2.start();

//        Thread thread = new Thread(new Runner());
//        thread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        myThread.shutdown();

        System.out.println("Main Thread");
    }
}

//первый способ создания потока - наследование от класса Thread
class MyThread extends Thread {
    private volatile boolean running = true; //не кэшируем - берем из общей памяти

    @Override
    public void run() {
        while (running){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("MyThread");
        }
//        System.out.println("****************");
    }

    public void shutdown(){
        this.running=false;
    }
}

//второй способ создания потока - реализация интерфейса от Runable
class Runner implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Runner" + i);
        }
        System.out.println("****************");
    }
}
package ThreadWork;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockWork {
    public static void main(String[] args) throws InterruptedException {
        RunnerWork runner = new RunnerWork();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.firstThread();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.secondThread();
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        runner.finishThread();
    }
}

class RunnerWork {
    private Account account1 = new Account();
    private Account account2 = new Account();
    Random amountRandom = new Random();
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    public void firstThread() {
        for (int i = 0; i < 10000; i++) {
            getLock(lock1, lock2);
            try {
                Account.transfer(account1, account2, amountRandom.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    private void getLock(Lock lock1, Lock lock2) {
        boolean firstLockTaken = false;
        boolean secondLockTaken = false;
        while (true) {
            try {
                firstLockTaken = lock1.tryLock();
                secondLockTaken = lock2.tryLock();
            } finally {
                if (firstLockTaken && secondLockTaken) {
                    return;
                }
                if (firstLockTaken) {
                    lock1.unlock();
                }
                if (secondLockTaken) {
                    lock2.unlock();
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void secondThread() {
        for (int i = 0; i < 10000; i++) {
            getLock(lock2, lock1);
            try {
                Account.transfer(account2, account1, amountRandom.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void finishThread() {
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println("Total balance " + (account1.getBalance() + account2.getBalance()));
    }

}

class Account {
    private int balance = 10000;

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withDraw(int amount) {
        this.balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public static void transfer(Account acc1, Account acc2, int amount) {
        acc1.withDraw(amount);
        acc2.deposit(amount);
    }
}
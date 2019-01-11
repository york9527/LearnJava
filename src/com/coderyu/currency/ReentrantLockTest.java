package com.coderyu.currency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class ReentrantLockTest {

    public static void main(String[] args) {
        LockTest lockTest = new LockTest();
        IntStream range = IntStream.range(0, 5);

        range.forEach(i -> {
            new Thread(() -> lockTest.DoTaskLock()).start();
            new Thread(()->lockTest.DoTaskWithNoLock()).start();
        });
    }
}

class LockTest {

    private final Lock lock = new ReentrantLock();
    private int countLock = 0;
    private int count = 0;

    public void DoTaskLock() {
        try {
            lock.lock();
            Tools.sleep(10);
            countLock++;
            System.out.printf("countLock:%d \r\n", countLock);
        } finally {
            lock.unlock();
        }
    }

    public void DoTaskWithNoLock() {
        Tools.sleep(10);
        count++;
        System.out.printf("count:%d \r\n", count);
    }
}

package com.coderyu.currency;

import com.sun.org.glassfish.external.statistics.CountStatistic;

import java.util.stream.IntStream;

public class SynchronizedTest {
    private static final Object lock=new Object();
    private static int countSync=0;
    private static int count=0;

    public static void main(String[] args){

        IntStream range=IntStream.range(0,5);
        range.forEach(i->{
            new Thread(()-> syncPlus()).start();
            new Thread(()-> plus()).start();
        });

        Tools.sleep(2000);
    }

    //private synchronized static void syncPlus(){
    private static void syncPlus(){
        synchronized (lock) {
            Tools.sleep(10);
            countSync++;
            System.out.printf("countSync=%d \r\n", countSync);
        }
    }

    private static void plus(){
        Tools.sleep(10);
        count++;
        System.out.printf("count=%d \r\n",count);
    }
}

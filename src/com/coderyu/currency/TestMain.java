package com.coderyu.currency;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);

        Runnable task = () -> {
            int temp = list.get(0);
            list.set(0, temp + 1);
        };

        for (int i = 0; i < 30; i++) {
            new Thread(task).start();
        }

        //等待线程执行完
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        System.out.printf("sum=%d \r\n", list.get(0));
    }
}

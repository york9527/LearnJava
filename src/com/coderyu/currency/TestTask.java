package com.coderyu.currency;

public class TestTask implements Runnable {

    private int i=0;

    public TestTask(int i){
        this.i=i;
    }

    @Override
    public void run() {
        long threadId=Thread.currentThread().getId();
        System.out.printf("ThreadId:%d %s \r\n",threadId,i);
    }
}

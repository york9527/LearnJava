package com.coderyu.currency;

public class ThreadJoinTest {
    public static void main(String[] args) {

        Thread threadB = new Thread(() -> {
            Tools.sleep(100000);
            for(int i=0;i<3;i++) {
                System.out.printf("Id of Thread B=%d \r\n", Thread.currentThread().getId());
            }
        });

        Thread threadA = new Thread(() -> {
            for(int i=0;i<3;i++) {
                if(i==1){
                    try {
                        threadB.join();
                    }catch (Exception e){}
                }
                System.out.printf("Id of Thread A=%d \n", Thread.currentThread().getId());
            }
        });

        threadA.start();
        threadB.start();
    }
}

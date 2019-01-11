package com.coderyu.currency;

import java.util.Random;

public class Tools {

    public static void sleep(int milliSeconds){
        try {
            Thread.sleep(milliSeconds);
        }catch (Exception e){

        }
    }

    public static void sleepRandomSeconds(int maxMilliSeconds){
        int randomMilliSeconds= new Random().nextInt(maxMilliSeconds);
        sleep(randomMilliSeconds);
    }

}

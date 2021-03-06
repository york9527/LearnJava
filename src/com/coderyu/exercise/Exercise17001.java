package com.coderyu.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Exercise17001 {
    public static void main(String[] args) {
        String[] fruits=new String[]{"apple","banana","oreng","grape","pineapple"};
        List<String> arrayList=new ArrayList<>();
        List<String> linkedList=new LinkedList<>();
        for(String fruit : fruits){
            arrayList.add(fruit);
            linkedList.add(fruit);
        }

        System.out.println(arrayList);
        System.out.println(linkedList);

        Collections.shuffle(arrayList);
        Collections.shuffle(linkedList);

        System.out.println("After Collectons.shuffle()");
        System.out.println(arrayList);
        System.out.println(linkedList);
    }
}/*
[apple, banana, oreng, grape, pineapple]
[apple, banana, oreng, grape, pineapple]
After Collectons.shuffle()
[apple, grape, pineapple, oreng, banana]
[grape, banana, apple, oreng, pineapple]
*/

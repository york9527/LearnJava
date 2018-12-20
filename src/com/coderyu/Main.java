package com.coderyu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
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
}/* out put
[apple, banana, oreng, grape, pineapple]
[apple, banana, oreng, grape, pineapple]
After Collectons.shuffle()
[banana, grape, pineapple, apple, oreng]
[oreng, pineapple, grape, apple, banana]
*/
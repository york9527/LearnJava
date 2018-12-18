package com.coderyu;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.addFirst("X");

        for (String str : list) {
            System.out.println(str);
        }
    }
}

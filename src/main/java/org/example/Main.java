package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < Integer.MAX_VALUE-8; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
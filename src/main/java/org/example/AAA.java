package org.example;

import java.util.ArrayList;

public class AAA {
    byte[] array = new byte[1024 * 1024];
    public static void main(String[] args) {
        ArrayList<AAA> list = new ArrayList<>();
        int count=0;


        try {
            while (true) {
                list.add(new AAA());
                count = count + 1;
            }
        }catch (Exception e) {
            System.out.println("count: "+ count);
            e.printStackTrace();
        }
    }
}

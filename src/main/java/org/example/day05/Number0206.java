package org.example.day05;

import java.io.File;

public class Number0206 {
    public static void main(String[] args) {
        File file = new File("  ");
        File[] files = file.listFiles();
        for (File file1 : files) {
            String name = file1.getName();
            System.out.println(name);
        }
        System.out.println(files.length);
    }


}


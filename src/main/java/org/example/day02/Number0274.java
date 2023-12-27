package org.example.day02;

import java.util.Arrays;

public class Number0274 {
    public static void main(String[] args) {
        int[] c = {100};

        System.out.println(hIndex(c));
    }

    private static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int len = citations.length;
        // 本办法  双层for 循环
        // {0, 1, 3, 5, 6}
        int h = 1;

        for (int i = len - 1; i >= 0; i--) {
            if (citations[i] > h) h++;
            else break;
        }
        return h-1;
    }
}

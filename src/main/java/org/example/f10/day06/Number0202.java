package org.example.f10.day06;

import java.util.HashSet;
import java.util.Set;

public class Number0202 {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        Set<Integer> record = new HashSet<>();
        while (n != 1 && !record.contains(n)){
            record.add(n);
            n = getNextNumber(n);
        }
        return n==1;
    }

    private static int getNextNumber(int n) {
        int res = 0;
        while (n > 0) {
            int temp = n % 10;
            res += temp * temp;
            n = n / 10;
        }
        return res;
    }
}

package org.example.f20.day18;

import java.util.Arrays;

public class Number0518 {
    public static void main(String[] args) {
        int amount = 5;
        int[] coins = {1,2,5};
        Number0518 t = new Number0518();
        int maxForm = t.change(amount,coins);
        System.out.println(maxForm);
    }

    public int change(int amount, int[] coins) {
        // TODO stick to it
        System.out.println(amount);
        System.out.println(Arrays.toString(coins));
        return 0;
    }
}

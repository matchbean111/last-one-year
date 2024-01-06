package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(f(3));
    }

    static int f(int n) {
        if (n <= 1) return 1;
        return f(n - 1) + g(n - 2);
    }

    static int g(int n) {
        if (n <= 1) return 1;
        return f(n + 1) + g(n - 1);
    }
}
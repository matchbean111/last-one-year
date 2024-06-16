package org.example.easy;

public class N2894 {
    public static void main(String[] args) {
        int n = 5;
        int m = 6;
        N2894 t = new N2894();
        System.out.println(t.differenceOfSums(n, m));
    }

    public int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                num1 += i;
            } else {
                num2 += i;
            }
        }
        return num2 - num1;
    }
}

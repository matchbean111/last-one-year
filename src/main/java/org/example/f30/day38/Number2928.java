package org.example.f30.day38;

public class Number2928 {
    public static void main(String[] args) {
        Number2928 t = new Number2928();
        int n = 5;
        int limit = 2;
        int distributeCandies = t.distributeCandies(n, limit);
        System.out.println(distributeCandies);
    }

    public int distributeCandies(int n, int limit) {
        int result = 0;
        // 第一个小孩
        for (int i = 0; i <= limit; i++) {
            // 第二个小孩
            for (int j = 0; j <= limit; j++) {
                if (i + j > n) {
                    break;
                }
                if (n - i - j <= limit) {
                    result++;
                }
            }
        }
        return result;
    }
}

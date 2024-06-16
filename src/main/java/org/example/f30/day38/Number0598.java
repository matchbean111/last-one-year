package org.example.f30.day38;

public class Number0598 {
    public static void main(String[] args) {
        Number0598 t = new Number0598();
        int m = 3, n = 3;
        int[][] ops = {{2, 2}, {3, 3}, {3, 3}, {3, 3}, {2, 2}, {3, 3}, {3, 3}, {3, 3}, {2, 2}, {3, 3}, {3, 3}, {3, 3}};
        int maxCount = t.maxCount(m, n, ops);
        System.out.println(maxCount);
    }

    public int maxCount(int m, int n, int[][] ops) {
        int mina = m, minb = n;
        for (int[] op : ops) {
            mina = Math.min(mina, op[0]);
            minb = Math.min(minb, op[1]);
        }
        return mina * minb;
    }
}

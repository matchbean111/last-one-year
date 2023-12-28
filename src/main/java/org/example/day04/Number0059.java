package org.example.day04;

public class Number0059 {
    public static void main(String[] args) {
        int n = 3;

        int[][] res = generateMatrix(n);
    }

    private static int[][] generateMatrix(int n) {
        int l = 0;
        int r = n-1;
        int t = 0;
        int b = n-1;
        int[][] mat = new int[n][n];
        int num = 1;
        int target = n * n;
        while (num <= target) {
            for (int i = l; i <=r; i++) mat[t][i] = num++;
            t++;
            for (int i = t; i <= b; i++) mat[i][r] = num++;
            r--;
            for (int i = r; i >= l; i--) mat[b][i] = num++;
            b--;
            for (int i = b; i >= t; i--) mat[i][l] = num++;
            l++;
        }

        return mat;
    }
}

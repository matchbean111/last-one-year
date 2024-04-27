package org.example.f20.day14;

public class Number0062 {
    public static void main(String[] args) {
        Number0062 t = new Number0062();
        int i = t.uniquePaths(7, 7);
        System.out.println(i);
    }

    static void llll(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("\t%d ", arr[i][j]);
            }
            System.out.print("\n");
        }
    }

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        print(dp);
        return dp[m - 1][n - 1];
    }

    public void print(int[][] arr) {
        llll(arr);
    }
}

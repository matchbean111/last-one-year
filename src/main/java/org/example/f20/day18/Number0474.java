package org.example.f20.day18;

public class Number0474 {
    public static void main(String[] args) {
        String[] strs = {"10", "0001", "111001", "1", "0"};
        int m = 5, n = 3;
        Number0474 t = new Number0474();
        int maxForm = t.findMaxForm(strs, m, n);
        System.out.println(maxForm);
    }

    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        int zeroNum;
        int oneNum;

        for (String str : strs) {
            oneNum = 0;
            zeroNum = 0;

            for (char c : str.toCharArray()) {
                if (c == '0') zeroNum++;
                else oneNum++;
            }

            for (int i = m; i >= zeroNum; i--) {
                for (int j = n; j >= oneNum; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeroNum][j - oneNum] + 1);
                }
            }
        }

        return dp[m][n];
    }
}

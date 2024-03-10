package org.example.f20.day17;

public class Number0121 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        Number0121 t = new Number0121();
        int i = t.maxProfit(prices);
        System.out.println(i);
    }

    public int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;

        int[] dp = new int[prices.length];
        dp[0] = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min_price) {
                min_price = prices[i];
            }
            // How to think => compare two variable? where to find
            dp[i] = Math.max(dp[i - 1], prices[i] - min_price);
        }

        return dp[prices.length - 1];
    }
}

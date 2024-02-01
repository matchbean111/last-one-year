package org.example.day11;

public class Number0121 {
    public static void main(String[] args) {
        Number0121 t = new Number0121();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(t.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            int prof = prices[i] - prices[i - 1];
            if (prof > 0) {
                res += prof;

            }
        }
        return res;
    }
}

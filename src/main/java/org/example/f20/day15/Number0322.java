package org.example.f20.day15;

import java.util.Arrays;

public class Number0322 {
    public static void main(String[] args) {
        Number0322 t = new Number0322();
        int[] coins = {1, 2, 5};
        int amount = 666;
        System.out.println(t.coinChange(coins, amount));
    }

    public int coinChange(int[] coins, int amount) {
        if (amount < 1) {
            return 0;
        }

        return dp(coins, amount);
    }

    private int dp(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);

        dp[0] = 0;

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] < 0) {
                    continue;
                }
                dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
            }
        }
        return (dp[amount] == amount + 1) ? -1 : dp[amount];
    }


}



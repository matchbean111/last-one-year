package org.example.f20.day17;


import static java.lang.Math.max;

public class KnapsackBruteForce {

    public static void main(String[] args) {
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int bagWeight = 8;
        int[] dp = new int[weights.length];

        for (int i = 0; i < weights.length; i++) { // 遍历物品
            for (int j = bagWeight; j >= weights[i]; j--) { // 遍历背包容量
                if (j >= weights.length) {
                    break;
                }
                dp[j] = max(dp[j], dp[j - weights[i]] + values[i]);
                System.out.println(dp[j]);
            }
        }

    }

}

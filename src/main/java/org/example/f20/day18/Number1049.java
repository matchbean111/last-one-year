package org.example.f20.day18;

public class Number1049 {
    public static void main(String[] args) {
        Number1049 t = new Number1049();

        int[] stones = {31, 26, 33, 21, 40};
        System.out.println("Last stone weight is: " + t.lastStoneWeightII(stones));
    }

    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }
        int target = sum / 2;
        int[] dp = new int[target + 1];

        for (int stone : stones) {
            for (int j = target; j >= stone; j--) {
                dp[j] = Math.max(dp[j], dp[j - stone] + stone);
            }
        }

        return sum - dp[target] * 2;
    }
}

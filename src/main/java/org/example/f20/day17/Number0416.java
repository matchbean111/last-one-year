package org.example.f20.day17;

import static java.lang.Math.max;


public class Number0416 {
    public static void main(String[] args) {
        Number0416 t = new Number0416();
        int[] nums = {1, 5, 11, 5};
        System.out.println(t.canPartition(nums));
    }

    public boolean canPartition(int[] nums) {

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 == 1) return false;
        int target = sum / 2;
        int[] dp = new int[target + 1];
        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                dp[j] = max(dp[j], dp[j - num] + num);
            }

            if (target == dp[target]) return true;
        }

        return dp[target] == target;
    }
}

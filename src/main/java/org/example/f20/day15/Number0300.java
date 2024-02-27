package org.example.f20.day15;

import java.util.Arrays;

public class Number0300 {
    public static void main(String[] args) {
        Number0300 t = new Number0300();
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(t.lengthOfLIS(nums));

    }

    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int res = 0;
        for (int i : dp) {
            res = Math.max(res, i);
        }

        return res;
    }
}

package org.example.f20.day14;

import java.util.Arrays;

public class Number0300 {
    public static void main(String[] args) {
        Number0300 t = new Number0300();
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(t.lengthOfLIS(nums));
    }

    public int lengthOfLIS(int[] nums) {
        // 定义：dp[i] 表示以 nums[i] 这个数结尾的最长递增子序列的长度
        int[] dp = new int[nums.length];
        // base case：dp 数组全都初始化为 1
        Arrays.fill(dp, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }

        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;

    }
}

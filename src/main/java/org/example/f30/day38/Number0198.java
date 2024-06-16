package org.example.f30.day38;

public class Number0198 {
    public static void main(String[] args) {
        Number0198 t = new Number0198();
        int[] nums = {2, 7, 9, 3, 1};
        int rob = t.rob(nums);
        System.out.println(rob);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return nums[0];
        }

        int[] dp = new int[n + 2];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[n - 1];
    }
}

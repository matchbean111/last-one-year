package org.example.f30.day38;

import java.util.Arrays;

public class Number0213 {
    public static void main(String[] args) {
        Number0213 t = new Number0213();
        int[] nums = {1, 2, 3, 1};
        int rob = t.rob(nums);
        System.out.println(rob);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        /*
        房子是个环了，
        {2,7,9,3,1}
        如果不是环 那就是 2 + 9 + 1
              环  那就是 2 + 9

        3 个房子 你最多只能 1个
        4个房子  你最多 2 个
        5个房子  你最多 2 个
        6个房子   你最多 3 个
        7个房子   你最多 3
         */

        /*
        怎么像第一个题目那么比较呢
        dp[i] = max(dp[i - 1], dp[i - 2] + nums[i])
        dp[i - 1]: i-1已经被抢了，i就不能被抢了，
        dp[i - 2] + nums[i] i-1 没有被抢， i-1被抢；
        dp[i] = max(dp[i - 1], dp[i - 2] + nums[i]) 为什么会得出这个公式呢。因为钱数是不断增多的


        是个环
        第一个和最后一个不能同时选
        1. 第一个选了，
        2. 第二个被选了
        3. 第一个，第二个都没有被选
        看这三种情况那种情况
         */
        /*

         */
        int res1 = 0;
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = nums[0];
        for (int i = 2; i < n - 1; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        res1 = dp[n - 2];

        int res2 = 0;
        Arrays.fill(dp, 0);
        dp[0] = 0;
        dp[1] = nums[1];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        res2 = dp[n - 1];

        int res3 = 0;
        Arrays.fill(dp, 0);
        dp[0] = 0;
        dp[1] = nums[1];
        for (int i = 2; i < n - 1; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        res3 = dp[n - 2];
        System.out.printf("%d %d %d\n", res1, res2, res3);
        return getMax(res1, res2, res3);
    }

    private int getMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}

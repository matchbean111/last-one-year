package org.example.f10.day03;

public class Number0209 {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        int ret = minSubArrayLen1(target, nums);
        System.out.println(ret);
        System.out.println();
        int ret1 = minSubArrayLen(target, nums);
        System.out.println(ret1);
    }

    private static int minSubArrayLen1(int target, int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        while (r < n) {
            int i = nums[r];
            sum = sum + i;

            System.out.printf("left = %d, right %d\n", l, r);

            while (sum >= target) {
                ans = Math.min(ans, r - l + 1);
                int j = nums[l];
                sum -= j;
                l++;
            }
            r++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }


    private static int minSubArrayLen(int target, int[] nums) {
        int a = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = i; j < nums.length; j++) {
                temp = nums[j] + temp;
                if (temp >= target) {
                    a = Math.min(a, j - i + 1);
                    break;
                }
            }
        }
        return a == Integer.MAX_VALUE ? 0 : a;
    }
}




















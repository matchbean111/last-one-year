package org.example.day02;

public class Number0209 {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        int ret = minSubArrayLen(target, nums);
        System.out.println(ret);
    }

    private static int minSubArrayLen(int target, int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j] + temp;
                if (temp > target) {
                    a = Math.min(a, j - i + 1);
                    break;
                }
            }
        }
        return 0;
    }
}

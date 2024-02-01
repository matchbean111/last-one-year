package org.example.day11;

public class Number0053 {
    public static void main(String[] args) {
        Number0053 t = new Number0053();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(t.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        int sum = 0;

        for (int num: nums) {
            sum = sum > 0 ? sum + num : num;
            maxValue = Math.max(maxValue, sum);
        }
        return maxValue;
    }
}

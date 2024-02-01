package org.example.day11;

public class Number0053 {
    public static void main(String[] args) {
        Number0053 t = new Number0053();
        t.maxSubArray(null);
    }

    public int maxSubArray(int[] nums) {
        int max = Integer.MAX_VALUE;
        int sum = 0;

        for (int num: nums) {
            sum = sum > 0 ? sum + num : num;
            max = Math.max(max, sum);
        }
        return max;
    }
}

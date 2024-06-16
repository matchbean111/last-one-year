package org.example.easy;

public class N0643 {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        N0643 t = new N0643();
        double maxAverage = t.findMaxAverage(nums, k);
        System.out.println(maxAverage);
    }

    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int start = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            start = i;
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }


        return sum * 1.0 / start;
    }
}

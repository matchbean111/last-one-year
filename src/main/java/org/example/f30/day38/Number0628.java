package org.example.f30.day38;

import java.util.Arrays;

public class Number0628 {
    public static void main(String[] args) {
       int[]  nums = {-1,-2,-3};
        Number0628 t = new Number0628();
        int i = t.maximumProduct(nums);
        System.out.println(i);
    }

    public int maximumProduct(int[] nums) {
        int n = nums.length;
        if (n == 3) {
            return nums[0] * nums[1] * nums[2];
        }

        int res = 0;
        Arrays.sort(nums);

        if (nums[n-1] < 0) {
            return nums[n-1] * nums[n-2] * nums[n-3];
        }
        if (nums[0] > 0) {
            return nums[n-1] * nums[n-2] * nums[n-3];
        }

        return 0;
    }
}

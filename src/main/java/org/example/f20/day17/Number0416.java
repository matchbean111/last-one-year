package org.example.f20.day17;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Number0416 {
    public static void main(String[] args) {
        Number0416 t = new Number0416();
        int[] nums = {1,2,3,5};
        System.out.println(t.canPartition(nums));
    }

    public boolean canPartition(int[] nums) {
        Arrays.sort(nums);

        int sum =0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int target = sum / 2;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            
        }

        return false;
    }
}

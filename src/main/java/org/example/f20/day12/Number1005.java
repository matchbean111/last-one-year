package org.example.f20.day12;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Number1005 {
    public static void main(String[] args) {
        Number1005 t = new Number1005();
        int[] nums = {3, -1, 0, 2};
        int k = 3;
        System.out.println(t.largestSumAfterKNegations(nums, k));

    }


    public int largestSumAfterKNegations(int[] nums, int k) {

        nums = IntStream.of(nums).boxed().sorted((o1, o2) -> Math.abs(o2) - Math.abs(o1)).mapToInt(Integer::intValue).toArray();
        int len = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && k > 0) {
                nums[i] = -nums[i];
                k--;
            }
        }
        if (k % 2 == 0) {
            nums[len - 1] = -nums[len - 1];
        }
        return Arrays.stream(nums).sum();
    }
}

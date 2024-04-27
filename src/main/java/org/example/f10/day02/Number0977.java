package org.example.f10.day02;

import java.util.Arrays;

public class Number0977 {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] arr = sortedSquares(nums);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int index = r;
        int[] arr = new int[nums.length];
        while (l < r) {
            int lq = nums[l] * nums[l];
            int rq = nums[r] * nums[r];
            if (lq > rq) {
                arr[index] = lq;
                l++;
            } else {
                arr[index] = rq;
                r--;
            }
            index--;
        }
        return arr;
    }
}

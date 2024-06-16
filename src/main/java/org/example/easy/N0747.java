package org.example.easy;

public class N0747 {
    public static void main(String[] args) {

    }

    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                index = i;
                max = nums[i];
            }
        }

        for (int i = 0; i < n && i != index; i++) {
            if (max < nums[i] * 2) {
                return -1;
            }
        }
        return index;

    }
}

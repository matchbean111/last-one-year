package org.example.easy;

import java.util.Arrays;

public class N1920 {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        N1920 t= new N1920();
        int[] res =t.buildArray(nums);
        for (int n : res) {
            System.out.println(n);
        }
    }

    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}

package org.example.day06;

import java.util.HashMap;

public class Number0454 {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {-2,-1};
        int[] nums3 = {-1,2};
        int[] nums4 = {0,2};

        int r = fourSumCount(nums1,nums2,nums3,nums4);
        System.out.println(r);
    }
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i : nums1) {
            for (int j : nums2) {
                int sum = i+j;
                map.put(sum,map.getOrDefault(sum, 0) + 1);
            }
        }

        for (int i : nums3) {
            for (int j : nums4) {
                res += map.getOrDefault(-i - j,0);
            }
        }
        return res;
    }
}

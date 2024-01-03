package org.example.day06;

import java.util.HashMap;

public class Number0001 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] re = twoSum(nums, target);
        for (int i : re) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                int j = map.get(target - nums[i]);
                return new int[]{i, j};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{-1,-1};
    }

}

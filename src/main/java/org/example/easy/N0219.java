package org.example.easy;

import java.util.HashSet;

public class N0219 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        N0219 t = new N0219();
        boolean b = t.containsNearbyDuplicate(nums, k);
        System.out.println(b);
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }
}

package org.example.f20.day19;

import java.util.HashSet;

public class Number0128 {
    public static void main(String[] args) {
        Number0128 t = new Number0128();

        int[] nums = {1, 2, 0, 1};
        int i = t.longestConsecutive(nums);
        System.out.println(i);
    }

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int count = 0;
        int res = 0;

        for (int n : set) {
            if (!set.contains(n - 1)) {
                count = 1;
                int curr = n;
                while (set.contains(curr + 1)) {
                    count++;
                    curr++;
                }
                res = Math.max(res, count);
            }
        }
        return res;
    }
}

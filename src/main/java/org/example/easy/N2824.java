package org.example.easy;

import java.util.ArrayList;
import java.util.List;

public class N2824 {
    public static void main(String[] args) {
        N2824 t = new N2824();
        List<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        int i = t.countPairs(nums, 2);
        System.out.println(i);
    }

    public int countPairs(List<Integer> nums, int target) {
        int res = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    res++;
                }
            }
        }

        return res;
    }
}

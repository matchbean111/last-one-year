package org.example.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N2859 {
    public static void main(String[] args) {
        N2859 t = new N2859();
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(10);
        nums.add(1);
        nums.add(5);
        nums.add(2);
        
        
        int res = t.sumIndicesWithKSetBits(nums, 1);
        System.out.println(res);;
    }

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (Integer.bitCount(i) == k) {
                System.out.println(Integer
                .bitCount(nums.get(i)) + " " + nums.get(i));
                ans = ans +nums.get(i);
            }
        }
        return ans;
    }
}

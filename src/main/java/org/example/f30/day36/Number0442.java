package org.example.f30.day36;

import java.util.LinkedList;
import java.util.List;

public class Number0442 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        Number0442 t = new Number0442();
        t.findDuplicates(nums);
    }

    public List<Integer> findDuplicates(int[] nums) {
//        int n = nums.length;
//        List<Integer> list = new ArrayList<Integer>();
//        int[] seen = new int[n + 1];
//
//        for (int num : nums) {
//            if (seen[num] == 0) {
//                seen[num] = 1;
//            } else {
//                list.add(num);
//            }
//        }
//        return list;
        List<Integer> res = new LinkedList<>();

        for (int num : nums) {
            if (nums[Math.abs(num) - 1] < 0) {
                res.add(Math.abs(num));
            } else {
                nums[Math.abs(num) - 1] *= -1;
            }
        }
        return res;
    }
}

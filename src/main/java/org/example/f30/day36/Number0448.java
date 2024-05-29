package org.example.f30.day36;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Number0448 {
    public static void main(String[] args) {
        Number0448 t = new Number0448();
        int[] nums = {4,3,2,7,8,2,3,1};
        t.findDisappearedNumbers(nums);
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
//
//        int n = nums.length;
//        for (int num : nums) {
//            int x = (num - 1) % n;
//            nums[x] += n;
//        }
//        List<Integer> list = new ArrayList<Integer>();
//        for (int i = 0; i < n; i++) {
//            if (nums[i] < n) {
//                list.add(i+1);
//            }
//        }
//        return list;

        for (int num : nums) {
            // 注意索引，nums 中元素大小从 1 开始，
            // 而索引是从 0 开始的，所以有一位索引偏移
            if (nums[Math.abs(num) - 1] < 0) {
                // 之前已经把对应索引的元素变成负数了，
                // 这说明 num 重复出现了两次，但我们什么都不用做，让索引继续保持负数
            } else {
                // 把索引 num - 1 置为负数
                nums[Math.abs(num) - 1] *= -1;
            }
        }

        List<Integer> res = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                // 说明没有元素和这个索引对应，即找到一个缺失元素
                res.add(i + 1);
            }
        }

        return res;
    }
}

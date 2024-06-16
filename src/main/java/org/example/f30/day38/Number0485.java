package org.example.f30.day38;

public class Number0485 {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 0, 1};
        Number0485 t = new Number0485();
        int maxConsecutiveOnes = t.findMaxConsecutiveOnes(nums);
        System.out.println(maxConsecutiveOnes);
    }

    public int findMaxConsecutiveOnes(int[] nums) {
//        int curCount = 0;
//        int maxCount = Integer.MIN_VALUE;
//
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            if (nums[i] == 1) {
//                curCount++;
//                maxCount = Math.max(maxCount, curCount);
//            } else {
//                curCount = 0;
//            }
//        }
//        return maxCount == Integer.MIN_VALUE ? 0 : maxCount;
        // 简单题目 往往就是大家发挥想象的时候了
        // 另外一种思路
//        int n = nums.length;
//        int index = -1;
//        int res = 0;
//        for (int i = 0; i < n; i++) {
//            if (nums[i] == 1) {
//                res = Math.max(res, i - index);
//            } else {
//                index = i;
//            }
//        }
//        return res;

        // 滑动窗口
        int n = nums.length;
        int left = 0;
        int right = 0;
        int res = 0;

        while (right < n) {
            if (nums[right++] == 0) {
                res = Math.max(res, right - left - 1);
                right++;
                left = right;
            }
        }

        return Math.max(res, right - left);
    }
}

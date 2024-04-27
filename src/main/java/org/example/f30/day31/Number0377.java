package org.example.f30.day31;

import java.util.Arrays;
import java.util.LinkedList;

public class Number0377 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int target = 4;
        int i = new Solution().combinationSum4(nums, target);
        System.out.println(i);
    }
}

class Solution {
    int res = 0;
    // 记录回溯算法的递归路径
    LinkedList<Integer> track = new LinkedList<>();
    int sum = 0;

    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        backtrack(nums, target, 0, sum);
        return res;
    }

    void backtrack(int[] nums, int target, int start, int sum) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            res++;
            return;
        }

        for (int i = start; i < nums.length; i++) {
            sum += nums[i];
            track.add(nums[i]);
            backtrack(nums, target, i, sum);
            track.removeLast();
            sum -= nums[i];
        }
    }
}

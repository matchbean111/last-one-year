package org.example.f20.day12;

public class Number0045 {
    public static void main(String[] args) {
        Number0045 t = new Number0045();
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(t.jump(nums));
    }

    public int jump(int[] nums) {
        int curReach = 0;
        int nextReach = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            nextReach = Math.max(nextReach, i + nums[i]);
            if (i == curReach) {
                curReach = nextReach;
                res++;
                if (nextReach >= nums.length - 1) break;
            }
        }
        return res;
    }
}

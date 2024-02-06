package org.example.f20.day11;

public class Number0376 {
    public static void main(String[] args) {
        Number0376 t = new Number0376();

        int[] nums = {1,2,3,4,5,6,7,8,9};

        System.out.println(t.wiggleMaxLength(nums));

    }

    public int wiggleMaxLength(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        if (len == 1) return 1;

        int res = nums[0] == nums[1] ? 1 : 2;
        int prev = (nums[1] - nums[0]);

        for (int i = 2; i < len; i++) {
            int cur = nums[i] - nums[i-1];
            if (cur != 0 && overZero(cur) != overZero(prev)) {
                res++;
                prev = cur;
            }
        }
        return res;
    }

    public int overZero(int n) {
        return Integer.compare(n, 0);
    }
}

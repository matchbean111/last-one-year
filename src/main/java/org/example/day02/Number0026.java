package org.example.day02;

public class Number0026 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                slow++;
                // 维护 nums[0..slow] 无重复
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }
}

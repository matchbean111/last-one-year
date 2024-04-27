package org.example.f10.day02;

public class Number0027 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 2, 3, 3, 3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }

    private static int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}

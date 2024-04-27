package org.example.f30.day32;


public class Number0665 {
    public static void main(String[] args) {
        int[] nums = {3, 4, 2, 3};
        Number0665 t = new Number0665();
        boolean i = t.checkPossibility(nums);
        System.out.println(i);
    }


    public boolean checkPossibility(int[] nums) {
        int last = nums[nums.length - 1];
        int order = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > last) {
                order++;
                last = nums[i];
            }

        }
        return order == 1;
    }

}

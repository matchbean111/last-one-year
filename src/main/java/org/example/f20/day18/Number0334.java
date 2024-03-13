package org.example.f20.day18;

public class Number0334 {
    public static void main(String[] args) {
        Number0334 t = new Number0334();
        int[] nums = {};
        System.out.println(t.increasingTriplet(nums));
    }

    public boolean increasingTriplet(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[k] > nums[j] && nums[j] > nums[i]) {
                        return true;
                    }
                }
            }
        }


        return false;
    }
}

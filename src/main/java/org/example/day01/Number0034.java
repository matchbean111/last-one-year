package org.example.day01;

public class Number0034 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(searchRange(nums, target));
    }

    public static int searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        while (low != high) {
            int mid = low + (high - low) / 2;
            if (target == nums[mid]) {
                low = low + (mid - low) / 2;
                high = mid + (high - mid) / 2;

            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid +1;
            }
        }
        return high + 1;



    }


}

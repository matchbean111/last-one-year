package org.example.f40.day40;

public class Number3038 {
    public static void main(String[] args) {
        Number3038 t = new Number3038();
        int[] nums = {3, 2, 1, 4, 5};
        int i = t.maxOperations(nums);
        System.out.println(i);
    }

    public int maxOperations(int[] nums) {
        int result = 1;
        int score = nums[0] + nums[1];
        for (int i = 2; i < nums.length; i++) {
            int temp = nums[i] + nums[i + 1];
            if (temp == score) {
                result++;
            } else {
                break;
            }
        }

        return result;
    }
}

package org.example.f30.day32;

public class Number0645 {
    public static void main(String[] args) {
        Number0645 t = new Number0645();
        int[] nums = {1,2,2,4};
        for (int errorNum : t.findErrorNums(nums)) {
            System.out.println(errorNum);
        }

    }

    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int origin = n * (n + 1) / 2;
        if (sum > origin) {
            return new int[]{ sum - origin + 1, sum - origin + 2};
        } else {
            return new int[]{ origin - sum , origin - sum + 1};
        }
    }
}

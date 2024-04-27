package org.example.f30.day31;

import java.util.Arrays;

public class Number0453 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Number0453 t = new Number0453();
        int i = t.minMoves(nums);
        System.out.println(i);
    }


    public int minMoves(int[] nums) {
        // if all equals: last state is sum % nums.length = 1 last state 2 is 
        
        int res = 0;
        int minimum = Arrays.stream(nums).min().getAsInt();
        for (int num : nums) {
            res += num - minimum;
        }
        return res;
    }

}

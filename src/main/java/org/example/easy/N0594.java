package org.example.easy;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class N0594 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        N0594 t = new N0594();
        int[] nums = {1,3,2,2,5,2,3,7};
        int lhs = t.findLHS(nums);
        System.out.println(lhs);
    }

    public int findLHS(int[] nums) {
        int i=0;
        int j=0;

        int n = nums.length;
        int maxLength = 0;
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>();
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        while (j < n) {
            int t = nums[j];
 
            j++;

            // maxLength = Math.max(maxLength, list.size());

            // while (i < j && max - min == 1) {
            //     i++;
            //     int lt = nums[i];

            // }

        }

        return 0;
    }
}

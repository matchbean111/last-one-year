package org.example.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number0039 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> track = new ArrayList<>();
    int trackSum=0;

    public static void main(String[] args) {
        Number0039 t = new Number0039(); 
        int[] nums = {1,2,3};
        int target = 3;
        List<List<Integer>> list = t.combinationSum(nums, target);
        for (List<Integer> is : list) {
            for (int i = 0; i < is.size(); i++) {
                System.out.printf("%d ", is.get(i));
            }
            System.out.printf("\n");
        }
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        backtrack(nums,0, target);
        return res;
    }

    void backtrack(int[] nums, int start, int target) {
        if (trackSum > target) {
            return;
        }
        if (trackSum == target) {
            res.add(new ArrayList<>(track));
            return;
        }
        
       
        for (int i = start; i < nums.length; i++) {
            // if (i > start && nums[i] == nums[i-1]) {
            //     continue;
            // }
            track.add(nums[i]);
            trackSum += nums[i];
            backtrack(nums, i, target);
            trackSum -= nums[i];
            track.remove(track.size()-1);
        }
    }


}

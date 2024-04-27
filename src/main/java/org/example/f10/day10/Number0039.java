package org.example.f10.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number0039 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> track = new ArrayList<>();


    public static void main(String[] args) {
        Number0039 t = new Number0039(); 
        int[] nums = {2,3,6,7};
        int target = 7;
        List<List<Integer>> list = t.combinationSum(nums, target);
        for (List<Integer> is : list) {
            for (int i = 0; i < is.size(); i++) {
                System.out.printf("%d ", is.get(i));
            }
            System.out.printf("\n");
        }
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {

        backtrack(nums,0, target,0);
        return res;
    }

    void backtrack(int[] nums, int start, int target, int sum) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            res.add(new ArrayList<>(track));
            return;
        }
        
       
        for (int i = start; i < nums.length; i++) {
            // if (i > start && nums[i] == nums[i-1]) {
            //     continue;
            // }
            track.add(nums[i]);
            sum += nums[i];
            backtrack(nums, i, target, sum);
            sum -= nums[i];
            track.remove(track.size()-1);
        }
    }


}

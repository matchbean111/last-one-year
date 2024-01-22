package org.example.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number0491 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> track = new ArrayList<>();

    public static void main(String[] args) {
        Number0491 t = new Number0491(); 
        int[] nums = {4,6,7,7};
        List<List<Integer>> list = t.subsetsWithDup(nums);
        for (List<Integer> is : list) {
            for (int i = 0; i < is.size(); i++) {
                System.out.printf("%d ", is.get(i));
            }
            System.out.printf("\n");
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // Arrays.sort(nums);
        backtrack(nums,0);
        return res;
    }

    void backtrack(int[] nums, int start) {
        if (track.size() >= 2) {
            res.add(new ArrayList<>(track));
            return;
        }
        
       
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i-1]) {
                continue;
            }
            if (nums[i] >= nums[start]) {
                track.add(nums[i]);
                backtrack(nums, i+1);
                
            }
            track.remove(track.size()-1);
           
        }
    }

}

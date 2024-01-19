package org.example.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number0090 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> track = new ArrayList<>();

    public static void main(String[] args) {
        Number0090 t = new Number0090(); 
        int[] nums = {1,2,2};
        List<List<Integer>> list = t.permute(nums);
        for (List<Integer> is : list) {
            for (int i = 0; i < is.size(); i++) {
                System.out.printf("%d ", is.get(i));
            }
            System.out.printf("\n");
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums,0);
        return res;
    }

    void backtrack(int[] nums, int start) {
      
        res.add(new ArrayList<>(track));
       
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i-1]) {
                continue;
            }
            track.add(nums[i]);
            backtrack(nums, i+1);
           
            track.remove(track.size()-1);
        }
    }


}

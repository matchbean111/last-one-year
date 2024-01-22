package org.example.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number0047 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> track = new ArrayList<>();

    public static void main(String[] args) {
        Number0047 t = new Number0047(); 
        int[] nums = {2,2,4,2};
        int target = 4;
        List<List<Integer>> list = t.permuteUnique(nums, target);
        for (List<Integer> is : list) {
            for (int i = 0; i < is.size(); i++) {
                System.out.printf("%d ", is.get(i));
            }
            System.out.printf("\n");
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums, int target) {
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used);
        return res;
    }

    void backtrack(int[] nums, boolean[] used) {
        if (track.size() == nums.length){
            res.add(new ArrayList<>(track));
        }
        
       
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i-1] && !used[i-1]){
                continue;
            }
            track.add(nums[i]);
            used[i] = true;
            backtrack(nums, used);
            used[i] = false;
            track.remove(track.size()-1);
        }
    }


}

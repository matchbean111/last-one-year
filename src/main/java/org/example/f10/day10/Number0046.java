package org.example.f10.day10;

import java.util.ArrayList;
import java.util.List;

public class Number0046 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> track = new ArrayList<>();

    public static void main(String[] args) {
        Number0046 t = new Number0046();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        List<List<Integer>> list = t.permute(nums);
        for (List<Integer> is : list) {
            for (int i = 0; i < is.size(); i++) {
                System.out.printf("%d ", is.get(i));
            }
            System.out.print("\n");
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used);
        return res;
    }

    void backtrack(int[] nums, boolean[] used) {
        if (track.size() == nums.length) {
            res.add(new ArrayList<>(track));
        }


        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            track.add(nums[i]);
            used[i] = true;
            backtrack(nums, used);
            used[i] = false;
            track.remove(track.size() - 1);
        }
    }


}

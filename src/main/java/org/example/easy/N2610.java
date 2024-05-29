package org.example.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class N2610 {
    public static void main(String[] args) {
        N2610 t = new N2610();
        int[] nums = {1, 3, 4, 1, 2, 3, 1};
        List<List<Integer>> matrix = t.findMatrix(nums);
        for (List<Integer> integers : matrix) {
            integers.forEach(System.out::print);
            System.out.println();
        }
    }

    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int idx = map.getOrDefault(num, 0);
            map.put(num, idx + 1);

            if (result.size() <= idx) {
                result.add(new ArrayList<>());
            }
            result.get(idx).add(num);
        }
        return result;
    }
}

package org.example.f10.day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Number0349 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        int[] result = intersection(arr1,arr2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int j : nums1) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        for (int j : nums2) {
            if (map.containsKey(j)) {
                set.add(j);
            }
        }
        return set.stream().mapToInt(x->x).toArray();
    }
}

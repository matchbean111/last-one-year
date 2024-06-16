package org.example.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class N1282 {
    public static void main(String[] args) {
        int[] groupSizes = {3, 3, 3, 3, 3, 1, 3};
        N1282 t = new N1282();
        t.groupThePeople(groupSizes);
    }

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            map.put(groupSizes[i], i);
        }
        List<List<Integer>> result = new ArrayList<>();


        return result;
    }
}

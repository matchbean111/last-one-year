package org.example.easy;

import java.util.HashMap;
import java.util.Map;

public class N2391 {
    public static void main(String[] args) {

    }


    public int garbageCollection(String[] garbage, int[] travel) {
        Map<Character, Integer> distance = new HashMap<>();
        int res = 0;
        int curDis = 0;
        for (int i = 0; i < garbage.length; i++) {
            res += garbage[i].length();

            if (i > 0) {
                curDis += travel[i - 1];
            }

            for (char c : garbage[i].toCharArray()) {
                distance.put(c, curDis);
            }
        }

        return res + distance.values().stream().reduce(0, Integer::sum);
    }
}

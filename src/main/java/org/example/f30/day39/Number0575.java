package org.example.f30.day39;

import java.util.HashMap;

public class Number0575 {
    public static void main(String[] args) {
        Number0575 t = new Number0575();
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int i = t.distributeCandies(candyType);
        System.out.println(i);
    }

    public int distributeCandies(int[] candyType) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < candyType.length; i++) {
            map.put(candyType[i], map.getOrDefault(candyType[i], 0) + 1);
        }
        System.out.println(map.size());

        return Math.min(map.size(), candyType.length / 2);
    }
}

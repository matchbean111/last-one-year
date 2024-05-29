package org.example.f30.day38;

import java.util.TreeSet;

public class Number0414 {
    public static void main(String[] args) {

    }

    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : nums) {
            set.add(num);
            if (set.size() > 3) {
                set.remove(set.first());
            }
        }

        return set.size() == 3 ? set.first() : set.last();
    }
}


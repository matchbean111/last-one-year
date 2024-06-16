package org.example.f40.day41;

import java.util.Arrays;

public class Number0881 {
    public static void main(String[] args) {
        int[] people = {1, 2};
        int limit = 3;
        Number0881 t = new Number0881();
        int i = t.numRescueBoats(people, limit);
        System.out.println(i);
    }

    /**
     * You are given an array people where people[i] is the weight of the ith person,
     * and an infinite number of boats where each boat can carry a maximum weight of limit.
     * Each boat carries at most two people at the same time, provided the sum of the weight
     * of those people is at most limit.
     * Return the minimum number of boats to carry every given person.
     *
     * @param people 人的体重
     * @param limit  船的最大载荷
     * @return 需要几艘船
     */
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int light = 0, heavy = n - 1;
        int res = 0;
        while (light <= heavy) {
            if (people[light] + people[heavy] <= light) {
                ++light;
            }
            --heavy;
            ++res;
        }
        return res;
    }
}

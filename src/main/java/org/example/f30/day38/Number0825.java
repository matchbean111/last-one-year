package org.example.f30.day38;

import java.util.Arrays;

public class Number0825 {
    public static void main(String[] args) {
        Number0825 t = new Number0825();
        int[] ages = {16, 17, 18};
        int i = t.numFriendRequests(ages);
        System.out.println(i);
    }

    private static boolean check(int[] ages, int x, int y) {
        if (x == y) return false;
        if (ages[y] <= 0.5 * ages[x] + 7) return false;
        if (ages[y] > ages[x]) return false;
        if (ages[y] > 100 && ages[x] < 100) return false;
        return true;
    }

    public int numFriendRequests(int[] ages) {
        Arrays.sort(ages);
        int count = 0;
        int n = ages.length;
        int x = 0, y = 1;
        /*
        暴力是不行的
         */

        return count;
    }
}

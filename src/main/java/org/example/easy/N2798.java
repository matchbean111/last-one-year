package org.example.easy;

import java.util.Arrays;

public class N2798 {
    public static void main(String[] args) {
        N2798 t = new N2798();
        int[] hours = {0, 1, 2, 3, 4};
        int target = 2;
        int res = t.numberOfEmployeesWhoMetTarget(hours, target);
        System.out.println(res);
    }

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int res = 0;
        res = (int) Arrays.stream(hours).filter(p -> p >= target).count();
        return res;
    }
}

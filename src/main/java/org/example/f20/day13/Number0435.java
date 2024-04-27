package org.example.f20.day13;

import java.util.Arrays;
import java.util.Comparator;

public class Number0435 {
    public static void main(String[] args) {
        Number0435 t = new Number0435();

        int[][] intervals = {{0, 2}, {1, 3}, {2, 4}, {3, 5}, {4, 6}};
        System.out.println(t.eraseOverlapIntervals(intervals));
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));

        int leftMost = intervals[0][0];
        int rightMost = intervals[0][1];
        for (int[] interval : intervals) {
            System.out.printf("%d %d\n", interval[0], interval[1]);
        }
        int res = 0;
        int[] temp = intervals[0];
        boolean b;
        for (int i = 1; i < intervals.length; i++) {
            b = findOverlap(intervals[i - 1], intervals[i]);
            if (b) {
                continue;
            } else {
                res++;
            }
        }

        return res;
    }

    private boolean findOverlap(int[] a, int[] b) {
        // 因为排序了，情况可以少一些
        // 1. 区间 不相交
        return b[0] >= a[1] || (a[0] > b[0] && a[1] < b[1]);
    }
}

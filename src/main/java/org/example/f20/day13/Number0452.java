package org.example.f20.day13;

import java.util.Arrays;
import java.util.Comparator;

public class Number0452 {
    public static void main(String[] args) {
        Number0452 t = new Number0452();

//        int[][] points = {{3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}};
        int[][] points = {{10, 16}, {2, 8}, {7, 12}, {1, 6}};
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
        for (int[] point : points) {
            System.out.printf("%d %d\n", point[0], point[1]);
        }
        System.out.printf("%d\n", t.findMinArrowShots(points));
    }

    public int findMinArrowShots(int[][] points) {
        int res = 1;

        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
        int[] temp = points[0];
        // 看来还是得先排序；
        for (int i = 1; i < points.length; i++) {
            temp = findOverlap(temp, points[i]);
            if (temp[0] == -1 && temp[1] == -1) {
                temp = points[i];
                res++;
            }
        }
        return res;
    }

    /**
     * 找到两条线段的重合区域
     *
     * @param a 开始的
     * @param b 结束的
     * @return 重合的区间
     */
    private int[] findOverlap(int[] a, int[] b) {
        // 因为排序了，情况可以少一些
        // 1. 区间 不相交
        if (a[1] < b[0]) {
            return new int[]{-1, -1};
        } else if (a[1] >= b[0]) {
            return new int[]{b[0], a[1]};
        } else {
            int left = Math.max(a[0], b[0]);
            return new int[]{left, b[1]};
        }
    }
}

package org.example.f10.day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number0054 {
    public static void main(String[] args) {
        int m = 3, n = 3;
        int[][] matrix = new int[m][n];

        List<Integer> res = spiralOrder(matrix);
        for (Integer res2 : res) {
            System.out.println(res2);
        }
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0)
            return new ArrayList<Integer>();
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1, x = 0;
        Integer[] res = new Integer[(r + 1) * (b + 1)];


        /**
         *  while (true){} 妙啊 精髓在下面4个循环不在说是依次执行了，
         *  谁满足条件谁执行
         *  while (true) {
         *      for (...) {
         *          ...
         *          break;
         *      }
         *      ...
         *      for (...) {
         *             ...
         *             break;
         *      }
         *      ...
         *  }
         */
        while (true) {
            for (int i = l; i <= r; i++) res[x++] = matrix[t][i]; // left to right
            if (++t > b) break;
            for (int i = t; i <= b; i++) res[x++] = matrix[i][r]; // top to bottom
            if (l > --r) break;
            for (int i = r; i >= l; i--) res[x++] = matrix[b][i]; // right to left
            if (t > --b) break;
            for (int i = b; i >= t; i--) res[x++] = matrix[i][l]; // bottom to top
            if (++l > r) break;
        }
        return Arrays.asList(res);

    }
}

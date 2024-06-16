package org.example.f30.day31;

import java.util.LinkedList;
import java.util.List;

public class Number0054 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        Number0054 t = new Number0054();
        for (Integer i : t.spiralOrder(matrix)) {
            System.out.print(i + " ");
        }

    }

    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new LinkedList<>();
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;

        while (true) {

            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            if (top++ == bottom) break;


            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            if (right-- == left) break;

            for (int i = right; i >= left; i--) {
                list.add(matrix[bottom][i]);
            }
            if (bottom-- == top) break;

            for (int i = bottom; i >= top; i--) {
                list.add(matrix[i][left]);
            }
            if (left++ == right) break;
        }


        return list;
    }
}

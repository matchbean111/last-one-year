package org.example.f30.day31;

public class Number0498 {
    public static void main(String[] args) {
        Number0498 t = new Number0498();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i : t.findDiagonalOrder(matrix)) {
            System.out.println(i + " ");
        }

    }

    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m * n];
        int start = 0;
        int i = 0, j = 0;
        res[start++] = mat[i][j];
        while (start < m * n) {
            while (j >= 0) {
                res[start] = mat[i++][j--];
                start++;
            }
            j++;
            while (i >= 0) {
                res[start] = mat[i--][j++];
                start++;
            }
            i++;
        }
        return res;
    }
}

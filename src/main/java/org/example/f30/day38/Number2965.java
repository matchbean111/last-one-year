package org.example.f30.day38;

public class Number2965 {
    public static void main(String[] args) {
        Number2965 t = new Number2965();
        int[][] grid = { { 1, 3 }, { 2, 2 } };
        for (int missingAndRepeatedValue : t.findMissingAndRepeatedValues(grid)) {
            System.out.println(missingAndRepeatedValue);
        }

    }

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] count = new int[n * n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count[grid[i][j]]++;
            }
        }

        int[] res = new int[2];
        for (int i = 1; i <= n * n; i++) {
            if (count[i] == 2) {
                res[0] = i;
            }
            if (count[i] == 0) {
                res[1] = i;
            }
        }
        return res;

    }
}

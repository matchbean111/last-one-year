package org.example.easy;

public class N0807 {
    public static void main(String[] args) {
        int[][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        N0807 t = new N0807();
        int res = t.maxIncreaseKeepingSkyline(grid);
        System.out.println(res);
        
    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] rowMax = new int[n];
        int[] colMax = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
                colMax[j] = Math.max(colMax[j], grid[i][j]);
            }
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res += (Math.min(rowMax[i], colMax[j]) - grid[i][j]);
            }
        } 
        return res;
    }

 

}

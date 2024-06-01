package org.example.f30.day38;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Number0661 {
    public static void main(String[] args) {
        int[][] img = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        Number0661 t = new Number0661();

    }

    /**
     * 计算周围 8 个点包括自己的平均值
     *
     * @param img 图片像素值
     * @return 平滑过后的图片
     */
    public int[][] imageSmoother(int[][] img) {
        /*
            朴素解法
         */
//        int m = img.length;
//        int n = img[0].length;
//        int[][] result = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                int num = 0, sum = 0;
//                for (int x = i - 1; x <= i + 1; x++) {
//                    for (int y = j - 1; y <= j + 1; y++) {
//                        if (x >= 0 && x < m && y >= 0 && y < n) {
//                            num++;
//                            sum += img[x][y];
//                        }
//                    }
//                }
//                result[i][j] = sum / num;
//            }
//        }
//        return result;

        /*
            二维前缀和
         */
        int m = img.length;
        int n = img[0].length;
        int[][] sum = new int[m + 10][n + 10];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + img[i - 1][j - 1];
            }
        }
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int a = max(0, i - 1), b = max(0, j - 1);
                int c = min(m - 1, i + 1), d = min(n - 1, j + 1);
                int cnt = (c-a+1) * (d-b+1);
                int tot= sum[c+1][d+1] - sum[a][d+1] - sum[c+1][b] + sum[a][b];
                result[i][j] = tot / cnt;
            }
        }

        return result;
    }

}

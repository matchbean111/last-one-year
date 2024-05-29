package org.example.f30.day36;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Number1738 {
    public static void main(String[] args) {
        int[][] matrix = {{5, 2}, {1, 6}};
        int k = 3;
        Number1738 t = new Number1738();
        int i = t.kthLargestValue(matrix, k);
        System.out.println(i);
    }


    public int kthLargestValue(int[][] matrix, int k) {
//        int m = matrix.length;
//        int n = matrix[0].length;
//        int[][] xor = new int[m][n];
//
//        // 假设是2行3列
//        // 第一个肯定是知道的
////        xor[0][0] = matrix[0][0];
////        // 第二个是
////        xor[0][1] = matrix[0][0] ^ matrix[0][1];
////        // 第三个是
////        xor[0][2] = matrix[0][0] ^ matrix[0][1] ^ matrix[0][2];
////        // 第四个是
////        xor[1][0] = matrix[0][0] ^ matrix[1][0];
////        // 第五个是
////        xor[1][1] = matrix[0][0] ^ matrix[0][1] ^ matrix[1][0] ^ matrix[1][1];
////        // 第六个是
////        xor[1][2] = matrix[0][0] ^ matrix[0][1] ^ matrix[0][2] ^ matrix[1][0] ^ matrix[1][1] ^ matrix[1][2];
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                // 这个遍历是要填满 xor矩阵
//                // 初始一点是matrix[0][0]
//                int temp = matrix[0][0];
//                for (int x = 0; x <= i; x++) {
//                    for (int y = 0; y <= j; y++) {
//                        // 避免自己和自己 异或
//                        if (!(x == 0 && y == 0)) {
//
//                            temp ^= matrix[x][y];
//                        }
//                    }
//                }
//                xor[i][j] = temp;
//            }
//        }
//
//        // print xor
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.printf(xor[i][j] + " ,");
//            }
//        }
//        System.out.println();
//
//
//
//        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
//
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                pq.add(xor[i][j]);
//            }
//        }
//
//        int res=0;
//        for (int i = 0; i < k; i++) {
//            res = pq.poll();
//        }
//
//
//        return res;
        // 二维前缀和 + 排序
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] pre = new int[m + 1][n + 1];

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                pre[i][j] = pre[i - 1][j] ^ pre[i][j - 1] ^ pre[i - 1][j - 1] ^ matrix[i - 1][j - 1];
                result.add(pre[i][j]);
            }
        }

        Collections.sort(result, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        return result.get(k - 1);
    }
}

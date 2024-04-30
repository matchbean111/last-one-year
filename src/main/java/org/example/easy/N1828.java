package org.example.easy;

public class N1828 {
    public static void main(String[] args) {
        int[][] points = {{1,3},{3,3},{5,3},{2,2}};
        int[][] queries = {{2,3,1},{4,3,1},{1,1,2}};
        N1828 t = new N1828();
        int[] countPoints = t.countPoints(points, queries);
        for (int n : countPoints) {
            System.out.println(n);
        }
    }

    /**
     * 统计一个圆里面的点的数量
     * @param points 点
     * @param queries 圆
     * @return
     */
    public int[] countPoints(int[][] points, int[][] queries) {
        int m = points.length;
        int n = queries.length;
        int[] answer  = new int[n];
        for (int i = 0; i < n; i++) {
            // 圆 点 半径
            int[] temp = queries[i];
            int cx = temp[0], cy = temp[1], cr = temp[2];
            for (int j = 0; j < m; j++) {
                // 判断点在不在圆内
                int[] p = points[j];
                int px = p[0];
                int py = p[1];
                int dis = (cx - px) * (cx-px) + (cy - py)*(cy-py);
                if (dis <= temp[2] * temp[2]) {
                    answer[i]++;
                }
            }
        }
        

        return answer;
    }

}

package org.example.f30.day34;

public class LCR130 {
    int res = 0;

    public static void main(String[] args) {
        LCR130 t = new LCR130();
        int m = 40;
        int n = 70;
        int cnt = 50;
        int i = t.wardrobeFinishing(m, n, cnt);
        System.out.println(i);
    }

    public int wardrobeFinishing(int m, int n, int cnt) {
        boolean[][] visited = new boolean[m][n];
        dfs(m, n, cnt, 0, 0, visited);

        return res;
    }

    public void dfs(int m, int n, int cnt, int x, int y, boolean[][] visited) {
        if (x < 0 || y < 0 || x >= m || y >= n) {
            return;
        }

        if (x / 10 + x % 10 + y / 10 + y % 10 > cnt) {
            return;
        }

        if (visited[x][y]) {
            return;
        }

        res++;
        visited[x][y] = true;

        dfs(m, n, cnt, x + 1, y, visited);
        dfs(m, n, cnt, x, y + 1, visited);
        dfs(m, n, cnt, x - 1, y, visited);
        dfs(m, n, cnt, x, y - 1, visited);
    }
}

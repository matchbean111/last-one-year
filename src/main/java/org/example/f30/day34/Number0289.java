package org.example.f30.day34;

public class Number0289 {
    public static void main(String[] args) {
        int[][] board = {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};

    }

    public void gameOfLife(int[][] board) {
        int[] neighbors = {0, -1, 1};

        int rows = board.length;
        int cols = board[0].length;
        // make a copy of the board
        int[][] newBoard = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                newBoard[i][j] = board[i][j];
            }
        }

        // according to the origin matrix update the copy
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                // 对于每一个细胞统计其八个相邻位置里的活细胞数量
                int liveNeighbors = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (!(neighbors[i] == 0 && neighbors[j] == 0)) {
                            int r = (row + neighbors[i]);
                            int c = (col + neighbors[j]);

                            if ((r < rows && r >= 0) && (c < cols && c >= 0) && (newBoard[r][c]) == 1) {
                                liveNeighbors += 1;
                            }
                        }
                    }
                }

                // 规则 1 或 规则 3

                // 规则 4
            }
        }

        // swap the origin and the copy matrix
    }
}

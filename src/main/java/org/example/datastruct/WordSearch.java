package org.example.datastruct;

public class WordSearch {
    public static boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0 || word == null || word.length() == 0) {
            return false;
        }

        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean dfs(char[][] board, String word, int row, int col, int index) {
        if (index == word.length()) {
            return true;
        }

        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length
            || board[row][col] != word.charAt(index)) {
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '#'; // mark the cell as visited

        boolean found = dfs(board, word, row + 1, col, index + 1) ||
                        dfs(board, word, row - 1, col, index + 1) ||
                        dfs(board, word, row, col + 1, index + 1) ||
                        dfs(board, word, row, col - 1, index + 1);

        board[row][col] = temp; // restore the cell

        return found;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        String word1 = "ABCCED";
        String word2 = "SEE";
        String word3 = "ABCB";

        System.out.println("Word \"ABCCED\" exists: " + exist(board, word1));
        System.out.println("Word \"SEE\" exists: " + exist(board, word2));
        System.out.println("Word \"ABCB\" exists: " + exist(board, word3));
    }
}

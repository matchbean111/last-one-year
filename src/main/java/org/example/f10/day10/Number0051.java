package org.example.f10.day10;

import java.util.ArrayList;
import java.util.List;

public class Number0051 {
    List<List<String>> res = new ArrayList<>();

    public static void main(String[] args) {
        Number0051 t = new Number0051();
        t.solveNQueens(6);
    }

    public List<List<String>> solveNQueens(int n) {
        List<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append('.');
            }
            board.add(sb.toString());
        }
        backtrack(board, 0);
        return res;
    }

    void backtrack(List<String> board, int row) {
        if (row == board.size()) {
            res.add(new ArrayList<>(board));
            return;
        }

        int n = board.get(row).length();

        for (int col = 0; col < n; col++) {
            if (!isValid(board, row, col)) {
                continue;
            }

            StringBuilder sb = new StringBuilder(board.get(row));
            sb.setCharAt(col, 'Q');
            board.set(row, sb.toString());

            backtrack(board, row + 1);
            sb.setCharAt(col, '.');
            board.set(row, sb.toString());
        }
    }

    boolean isValid(List<String> board, int row, int col) {


        return false;
    }
}

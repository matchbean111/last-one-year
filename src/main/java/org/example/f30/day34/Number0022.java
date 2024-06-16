package org.example.f30.day34;

import java.util.ArrayList;
import java.util.List;

public class Number0022 {
    public static void main(String[] args) {

    }

    /**
     * 括号生成
     *
     * @param n 共有多少对
     * @return 答案
     */
    public List<String> generateParenthesis(int n) {
        if (n == 0) return new ArrayList<>();
        List<String> res = new ArrayList<>();
        StringBuilder track = new StringBuilder();
        backtrack(n, n, track, res);
        return res;
    }

    void backtrack(int left, int right, StringBuilder track, List<String> res) {
        if (right < left) return;
        if (left < 0 || right < 0) return;
        if (left == 0 && right == 0) {
            res.add(track.toString());
            return;
        }

        track.append('(');
        backtrack(left - 1, right, track, res);
        track.deleteCharAt(track.length() - 1);

        track.append(')');
        backtrack(left, right - 1, track, res);
        track.deleteCharAt(track.length() - 1);
    }
}

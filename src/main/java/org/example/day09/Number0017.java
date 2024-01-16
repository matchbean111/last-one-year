package org.example.day09;

import java.util.LinkedList;
import java.util.List;

public class Number0017 {
    List<String> res = new LinkedList<>();
    // 记录回溯算法的递归路径
    LinkedList<Integer> track = new LinkedList<>();

    public static void main(String[] args) {
        Number0017 t = new Number0017();
        String digits = "23";
        List<String> list = t.letterCombinations(digits);
        for (String is : list) {
            System.out.printf("%d ", is.get(i));
        }
    }

    public List<String> letterCombinations(String digits) {
        backtrack(0, null);
        return res;
    }

    void backtrack(int start, int[] n) {
        // base case
        res.add(new LinkedList<>(track));

        // 回溯算法标准框架
        for (int i = start; i < n.length; i++) {

            // 选择
            track.addLast(n[i]);
            // 通过 start 参数控制树枝的遍历，避免产生重复的子集
            backtrack(i + 1, n);
            // 撤销选择
            track.removeLast();
        }
    }
}

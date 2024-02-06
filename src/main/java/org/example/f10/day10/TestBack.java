package org.example.f10.day10;

import java.util.LinkedList;
import java.util.List;

public class TestBack {
    List<List<Integer>> res = new LinkedList<>();
    // 记录回溯算法的递归路径
    LinkedList<Integer> track = new LinkedList<>();

    public static void main(String[] args) {
        TestBack t = new TestBack();
        int[] nums = {1,2,3};
        t.subsets(nums);
    }

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0, nums);
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

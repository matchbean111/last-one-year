package org.example.day09;

import java.util.LinkedList;
import java.util.List;

public class Number0039 {
    List<List<Integer>> res = new LinkedList<>();
    // 记录回溯算法的递归路径
    LinkedList<Integer> track = new LinkedList<>();

    public static void main(String[] args) {
        Number0039 t = new Number0039();
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> list = t.combinationSum(candidates, target);
        for (List<Integer> is : list) {
            for (int i = 0; i < is.size(); i++) {
                System.out.printf("%d ", is.get(i));
            }
            System.out.printf("\n");
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates, target, 0);
        return res;
    }

    void backtrack(int[] candidates, int target, int start, int sum) {
        if (sum > target){
            
            return;
        }
        // base case
        if (sum == target) {
            // 遍历到了第 k 层，收集当前节点的值
            res.add(new LinkedList<>(track));
            return;
        }

        // 回溯算法标准框架
        for (int i = start; i <= (n - track.size()) + 1; i++) {
            if (n - i + 1 + track.size() < k) break;
            // 选择
            track.addLast(i);
            // 通过 start 参数控制树枝的遍历，避免产生重复的子集
            backtrack(i + 1, n, k);
            // 撤销选择
            track.removeLast();
        }
    }
}

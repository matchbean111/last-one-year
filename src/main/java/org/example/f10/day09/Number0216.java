package org.example.f10.day09;

import java.util.LinkedList;
import java.util.List;

public class Number0216 {
    List<List<Integer>> res = new LinkedList<>();
    // 记录回溯算法的递归路径
    LinkedList<Integer> track = new LinkedList<>();

    public static void main(String[] args) {
        Number0216 t = new Number0216();
        List<List<Integer>> list = t.combinationSum3(3, 9);
        for (List<Integer> is : list) {
            for (int i = 0; i < is.size(); i++) {
                System.out.printf("%d ", is.get(i));
            }
            System.out.printf("\n");
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
      
        backtrack(n,k, 0, 1);
        return res;
    }

    public void backtrack(int targetSum, int k, int sum, int start) {
        if (sum > targetSum) {
            return;
        }
        if (track.size() == k && sum == targetSum) {
            res.add(new LinkedList<>(track));
            return;
        }

        for (int i = start; i <= 9; i++) {
            sum += i;
            track.add(i);
            backtrack(targetSum, k, sum, i+1);
            track.removeLast();
            sum -= i;
        }
    }
}

package org.example.easy;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class N2974 {
    public static void main(String[] args) {
        N2974 t = new N2974();
        int[] nums = {5, 4, 2, 3};
        for (int i : t.numberGame(nums)) {
            System.out.println(i);
        }

    }

    public int[] numberGame(int[] nums) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pq.offer(nums[i]);
        }

        while (!pq.isEmpty()) {
            int alice = pq.poll();
            int bob = pq.poll();
            res.add(bob);
            res.add(alice);
        }

        return res.stream().mapToInt(i -> i).toArray();
    }
}

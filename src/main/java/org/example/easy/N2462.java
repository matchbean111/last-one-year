package org.example.easy;

import java.util.PriorityQueue;

public class N2462 {
    public static void main(String[] args) {
        N2462 t = new N2462();
        int[] cost = {17, 12, 10, 2, 7, 2, 11, 20, 8};
        int k = 3;
        int candidates = 4;
        t.totalCost(cost, k, candidates);
    }

    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < costs.length; i++) {
            pq.add(costs[i]);
        }

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        return 0L;
    }
}

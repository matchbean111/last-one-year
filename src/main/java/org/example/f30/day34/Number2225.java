package org.example.f30.day34;

import java.util.*;

public class Number2225 {
    public static void main(String[] args) {
        Number2225 t = new Number2225();
        int[][] matches = {{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};
        t.findWinners(matches);
    }

    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> loseTimes = new HashMap<>();
        HashMap<Integer, Integer> winTimes = new HashMap<>();
        HashSet<Integer> players = new HashSet<>();
        ArrayList<Integer> ans0 = new ArrayList<>();
        ArrayList<Integer> ans1 = new ArrayList<>();

        for (int[] match : matches) {
            loseTimes.put(match[1], loseTimes.getOrDefault(match[1], 0) + 1);
            winTimes.put(match[0], winTimes.getOrDefault(match[0], 0) + 1);
            players.add(match[0]);
            players.add(match[1]);
        }
        players.forEach(player -> winTimes.merge(player, 1, Integer::sum));
        System.out.println(players);
        for (Map.Entry<Integer, Integer> entry : loseTimes.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value == 1) {
                ans1.add(key);
            }
            System.out.printf("Loser: %d times: %d\n", key, value);
        }
        winTimes.forEach((k, v) -> {
            if (!loseTimes.containsKey(k)) {
                ans0.add(k);
            }
            System.out.printf("Winner: %d times: %d\n", k, v);
        });
        ArrayList<List<Integer>> res = new ArrayList<>();
        res.add(ans0);
        res.add(ans1);
        return res;
    }
}

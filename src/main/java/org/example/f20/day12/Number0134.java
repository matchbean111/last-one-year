package org.example.f20.day12;

public class Number0134 {
    public static void main(String[] args) {
        Number0134 t = new Number0134();
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        System.out.println(t.canCompleteCircuit(gas, cost));
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curGas = 0;
        int n = gas.length;
        int res = Integer.MAX_VALUE;
        
        for (int start = 0; start < n; start++) {
            for (int i = start; i < n + start; i++) {
                int localI = i % (n);
                curGas = curGas + gas[localI];
                if (curGas >= cost[localI]) {
                    curGas -= cost[localI];
                } else {
                    curGas -= cost[localI];
                    
                    break;
                }
            }
            if (curGas >= 0) {
                res = start;
                break;
            }
            curGas = 0;

        }
        return res == Integer.MAX_VALUE ? -1 : res;

    }


    /**
     * 贪心算法
     *
     * @param gas  油
     * @param cost 消耗
     * @return
     */
    public int canCompleteCircuit1(int[] gas, int[] cost) {
        int curGas = 0;
        int n = gas.length;
        int totalGas = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            curGas += (gas[i] - cost[i]);
            totalGas += (gas[i] - cost[i]);
            if (curGas < 0) {
                start = i + 1;
                curGas = 0;
            }
        }
        if (totalGas < 0) return -1;
        return start;
    }
}

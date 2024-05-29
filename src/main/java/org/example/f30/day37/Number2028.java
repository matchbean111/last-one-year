package org.example.f30.day37;

import java.util.Arrays;

public class Number2028 {
    public static void main(String[] args) {

    }


    /**
     * 找出缺失的观测数据
     * @param rolls m次观测数据
     * @param mean m+n 次的平均值
     * @param n n次观测
     * @return 返回 n次的观测数据
     */
    public int[] missingRolls(int[] rolls, int mean, int n) {

        // m 次投掷
        int m = rolls.length;

        // m 次的总和
        int sum = Arrays.stream(rolls).sum();

        // m 次的平均值
        double avg = sum * 1.0 / m;

        // m + n 次的总和
        double supposedSum = (m + n) * mean;
        if (supposedSum < sum) {
            return new int[0];
        }
        if (supposedSum > sum + n * 6) {
            return new int[0];
        }
        return null;

    }
}

package org.example.f20.day18;

import java.util.Arrays;

public class AppTest {
    public static void main(String[] args) {
        int[] weight = {1, 3, 4};
        int[] value = {15, 20, 30};
        int bagWight = 4;
        testWeightBagProblem(weight, value, bagWight);
    }

    public static void testWeightBagProblem(int[] weight, int[] value, int bagWeight){

        int wLen = weight.length;
        //定义dp数组：dp[j]表示背包容量为j时，能获得的最大价值
        int[] dp = new int[bagWeight + 1];

        System.out.printf("wLen = %d, bagWeight = %d\n",wLen,bagWeight);
        //遍历顺序：先遍历物品，再遍历背包容量
        for (int i = 0; i < wLen; i++){
            for (int j = bagWeight; j >= weight[i]; j--){
                dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
            }
            for (int k = 0; k < dp.length; k++) {
                System.out.printf("%d,",dp[k]);
            }
            System.out.println();
        }
        //打印dp数组
        for (int j = 0; j <= bagWeight; j++){
            System.out.print(dp[j] + " ");
        }
    }
}

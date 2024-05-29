package org.example.f30.day36;

public class Number0041 {
    public static void main(String[] args) {
        Number0041 t = new Number0041();
        int[] nums = {3,4,-1,1};
        int i = t.firstMissingPositive(nums);
        System.out.println(i);
    }


    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int maxPositive = 0;
        int maxPosIndex = 0;
        int minPositive = Integer.MAX_VALUE;
        int minPosIndex = 0;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (num > 0 && num > maxPositive) {
                maxPositive = num;
                maxPosIndex = i + 1;
            }
            if (num > 0 && num < minPositive) {
                minPositive = num;
                minPosIndex = i + 1;
            }
        }
        System.out.printf("maxPositive: %d, maxPosIndex: %d\n" ,maxPositive, maxPosIndex);
        System.out.printf("minPositive: %d, minPosIndex: %d\n", minPositive, minPosIndex);

        /* 数组内 hash 1..n 最小和最大 差距要是特别大，但是只有极少数，肯定不是 如果是 1 3 遍历到 3,那我怎么知道2到底在不在数组中呢
        *
        *
        *
        *
        * */
        for (int i = 0; i < n; ++i) {
            if (nums[i] <= 0) {
                nums[i] = n + 1;
            }
        }

        for (int i = 0; i < n; ++i) {
            int num = Math.abs(nums[i]);
            if (num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }

        for (int i = 0; i < n; ++i) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }
}

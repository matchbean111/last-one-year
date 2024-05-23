package org.example.f30.day32;

public class Number0283 {
    public static void main(String[] args) {
        Number0283 t = new Number0283();
        int[] nums = {0, 1, 0, 3, 12};
        t.moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    /**
     * i,j 是两种区间的结束索引
     * i 是 全部都是 0 的索引
     * j 是 不是 0 的索引
     * 将 0 移动到后面 i >= j
     *
     * @param nums
     */
    public void moveZeroes(int[] nums) {

        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}

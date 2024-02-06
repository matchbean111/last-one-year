package org.example.f10.day02;

public class Number0283 {
    public static void main(String[] args) {
        Number0283 t = new Number0283();
        int[] nums = {0,1,0,3,12};
        t.moveZeroes(nums);
        for (int n : nums) {
            System.out.println(n);
        }
    }

    public void moveZeroes(int[] nums) {
        int i;
        int j=0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, i,j);
                j++;
            }
        }
    
    }

    public void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}

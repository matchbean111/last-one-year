package org.example.f30.day35;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Number0697 {
    public static void main(String[] args) {
        Number0697 t = new Number0697();
        int[] nums = {1, 2, 2, 3, 1};
        int shortestSubArray = t.findShortestSubArray(nums);
        System.out.println(shortestSubArray);
    }

    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, int[]> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i])[0]++;
                map.get(nums[i])[2] = i;
            } else {
                map.put(nums[i],new int[]{1,i,i,});
            }
        }

        int maxNum = 0;
        int minLen = 0;
        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            int[] arr = entry.getValue();
            if (maxNum < arr[0]) {
                maxNum = arr[0];
                minLen = arr[2] - arr[1] + 1;
            } else if (maxNum == arr[0]) {
                if (minLen > arr[2] - arr[1] + 1) {
                    minLen = arr[2] - arr[1] + 1;
                }
            }
        }
        return minLen;
    }
}

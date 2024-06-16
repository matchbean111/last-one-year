package org.example.f30.day35;

public class Number2903 {
    public static void main(String[] args) {
        Number2903 t = new Number2903();
        int[] nums = {5, 1, 4, 1};
        int indexDifference = 2, valueDifference = 4;
        int[] indices = t.findIndices(nums, indexDifference, valueDifference);
        System.out.println(indices[0] + " " + indices[1]);
    }


    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
//        int n = nums.length;
//        int[] result = new int[2];
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (Math.abs(nums[i] - nums[j]) >= valueDifference && Math.abs(i - j) >= indexDifference) {
//                    result[0] = i;
//                    result[1] = j;
//                    return result;
//                }
//            }
//        }
//
//
//        return new int[] {-1,-1};

        // 双指针
        int n = nums.length;

        int maxIdx = 0;
        int minIdx = 0;
        for (int j = indexDifference; j < n; j++) {
            int i = j - indexDifference;
            if (nums[i] > nums[maxIdx]) {
                maxIdx = i;
            } else if (nums[i] < nums[minIdx]) {
                minIdx = i;
            }
            if (nums[maxIdx] - nums[j] >= valueDifference) {
                return new int[]{maxIdx, j};
            }
            if (nums[j] - nums[minIdx] >= valueDifference) {
                return new int[]{minIdx, j};
            }
        }


        return new int[]{-1, -1};

    }
}

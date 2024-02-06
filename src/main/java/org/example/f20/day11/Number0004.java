package org.example.f20.day11;

public class Number0004 {
    public static void main(String[] args) {
        Number0004 t = new Number0004();
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        double medianSortedArrays = t.findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int l = Math.min(nums1[0], nums2[0]);
        int r = Math.max(nums1[m-1], nums2[n-1]);

        return 0.0;
    }
}

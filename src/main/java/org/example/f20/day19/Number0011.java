package org.example.f20.day19;

public class Number0011 {
    public static void main(String[] args) {
        Number0011 t = new Number0011();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int i = t.maxArea(height);
        System.out.println(i);
    }

    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int area;
        int res = 0;
        while (l < r) {
            area = Math.min(height[l], height[r]) * (r - l);
            res = Math.max(res, area);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }
}

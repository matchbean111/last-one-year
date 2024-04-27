package org.example.f20.day11;

import java.util.Arrays;

public class Number0455 {
    public static void main(String[] args) {
        int[] g = {10, 9, 8, 7};
        int[] s = {5, 6, 7, 8};

        Number0455 t = new Number0455();
        int max = t.findContentChildren(g, s);
        System.out.println(max);
    }

    /**
     * @param g 胃口值
     * @param s 饼干值
     * @return
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int index = 0; // 胃口数组的下标
        int result = 0;
        for (int i = 0; i < s.length && index < g.length; i++) {
            if (s[i] >= g[index]) {
                result++;
                index++;
            }
        }
        return result;
    }
}
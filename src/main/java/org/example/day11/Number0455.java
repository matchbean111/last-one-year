package org.example.day11;

import java.util.Arrays;

public class Number0455 {
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};

        Number0455 t = new Number0455();
        int max = t.findContentChildren(g, s);
        System.out.println(max);
    }

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int index = s.length - 1; // 饼干数组的下标
        int result = 0;
        for (int i = g.length - 1; i >= 0; i--) { // 遍历胃口
            if (index >= 0 && s[index] >= g[i]) { // 遍历饼干
                result++;
                index--;
            }
        }
        return result;
    }
}
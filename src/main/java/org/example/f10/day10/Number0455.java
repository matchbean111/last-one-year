package org.example.f10.day10;

import java.util.Arrays;

/**
 * Number0455
 */
public class Number0455 {
    public static void main(String[] args) {
        Number0455 t = new Number0455();
        int[] g = {10,9,8,7};
        int[] s= {5,6,7,8};
        int r = t.findContentChildren(g, s);
        System.out.println(r);
    }

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int res = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < g.length; j++) {
                if (s[i] >= g[j]) {
                    res++;
                    break;
                }
            }
        }
        return res;
    }
    
}

    

package org.example.f10.day03;

import java.util.HashMap;
import java.util.Objects;

public class Number0076 {
    public static void main(String[] args) {
        String s = "cabwefgewcwaefgcf";
        String t = "cae";
        String r = minWindow(s, t);
        System.out.println(r);
        int[] nusm = {1,2};

    }

    private static String minWindow(String s, String t) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        int l = 0;
        int r = 0;
        int n = s.length();
        int start = 0;
        int ans = Integer.MAX_VALUE;
        int valid = 0;
        while (r < n) {
            char c = s.charAt(r);
            r++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (Objects.equals(window.get(c), need.get(c))) valid++;
            }

            System.out.printf("left = %d, right = %d ", l, r);
            System.out.printf("window str = %s\n", new String(s.getBytes(),l,r-l));


            while (valid == need.size()) {
                System.out.println("hgfd");
                if (r - l < ans) {
                    start = l;
                    ans = r - l;
                }
                char d= s.charAt(l);
                l++;

                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d)))
                        valid--; // 只有当 window[d] 内的出现次数和 need[d] 相等时，才能 -1
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        return ans == Integer.MAX_VALUE ? "" : s.substring(start, start+ans);
    }

    private static String minWindowBrute(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                // 判断 s[i:j] 包含t所有字母
            }
        }
        return null;
    }
}
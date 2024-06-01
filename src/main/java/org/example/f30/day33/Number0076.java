package org.example.f30.day33;

import java.util.HashMap;

public class Number0076 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        Number0076 d = new Number0076();
        String minWindow = d.minWindow(s, t);
        System.out.println(minWindow);
    }

    public String minWindow(String s, String t) {
        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();
        int left = 0;
        int right = 0;
        int valid = 0;
        int len = Integer.MIN_VALUE;
        int start = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            // 更新数据
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c) .equals(need.get(c))) {
                    valid++;
                }
            }
            
            while (valid == need.size()) {
                if (right - left < len) {
                     start = left;
                     len = right - left;
                }
                char d = s.charAt(left);

                left++;

                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    window.put(d, window.get(d) -1 );
                }
            }
        }

        return len == Integer.MAX_VALUE ? "" : s.substring(start, len);
    }
}

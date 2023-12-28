package org.example.day03;

import java.util.HashMap;

public class Number0003 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int r = lengthOfLongestSubstring(s);
        System.out.println(r);
    }

    private static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> window = new HashMap<>();
        int l=0,r=0;
        int n = s.length();
        int ans = 0;
        while (r < n) {
            char c = s.charAt(r);
            r++;
            window.put(c,window.getOrDefault(c,0) + 1);

            while (window.get(c) > 1){
                char d = s.charAt(l);
                l++;
                if (window.containsKey(d)) {
                    window.put(d,window.get(d) - 1);
                }
            }
            ans = Math.max(ans, r-l);
        }
        return ans;
    }
}

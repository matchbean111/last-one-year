package org.example.day03;

import java.util.HashMap;
import java.util.Objects;

public class Number0567 {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean b= checkInclusion(s1,s2);
        System.out.println(b);
    }

    private static boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int l = 0, r = 0;
        int n = s2.length();
        int valid = 0;

        while (r < n) {
            char c= s2.charAt(r);
            r++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (Objects.equals(window.get(c), need.get(c))) valid++;
            }

            if (r - l >= s1.length()) {
                if (valid == s1.length()){
                    return true;
                }
                char d = s2.charAt(l);
                l++;
                if (need.containsKey(d)) {
                    if (need.get(d).equals(window.get(d))) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        return false;

    }
}

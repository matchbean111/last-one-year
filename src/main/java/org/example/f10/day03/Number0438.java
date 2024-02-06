package org.example.f10.day03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Number0438 {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> r = findAnagrams(s, p);
        for (Integer i : r) {
            System.out.println(i);
        }
    }

    private static List<Integer> findAnagrams(String s, String t) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int l = 0, r = 0;
        int valid = 0;
        List<Integer> list = new ArrayList<>();
        while (r < s.length()) {
            char c = s.charAt(r);
            r++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }
            System.out.printf("left = %d, right = %d\n", l, r);
            while (r - l >= t.length()) {
                if (valid == need.size()) {
                    list.add(l);
                }
                char d = s.charAt(l);
                l++;
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d)))
                        valid--;

                    window.put(d, window.get(d) - 1);
                }
            }
        }
        return list;

    }
}

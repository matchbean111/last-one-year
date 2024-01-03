package org.example.day06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Number0049 {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        HashMap<String, Integer> map = new HashMap<>();
        List<List<String>> list = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {

        }

        System.out.println(map.toString());
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] cnt = new int[26];
        for (char c : magazine.toCharArray()) {
            cnt[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            cnt[c - 'a']--;
            if(cnt[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}

package org.example.easy;

public class N0014 {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(strs));
    }


    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int count = strs.length;
        for (int i = 0; i < strs.length; i++) {
            char c = strs[i].charAt(i);
            for (int j = 1; j < count; j++) {
                if (c == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[i].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}

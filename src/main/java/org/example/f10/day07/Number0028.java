package org.example.f10.day07;

public class Number0028 {
    public static void main(String[] args) {
        String s = "sadbutsad";
        String t = "sad";
        int r = strStrNaive(s, t);
    }

    public static int strStrNaive(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        char[] s = haystack.toCharArray(), p = needle.toCharArray();

        for (int i = 0; i <= n - m; i++) {
            int a = i, b = 0;
            while (b < m && s[a] == p[b]) {
                a++;
                b++;
            }
            if (b == m) return i;
        }
        return -1;
    }

    public static int strStrKMP(String s, String t) {
        return 0;
    }
}

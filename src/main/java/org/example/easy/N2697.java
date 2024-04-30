package org.example.easy;

public class N2697 {
    public static void main(String[] args) {
        N2697 t = new N2697();
        String str = t.makeSmallestPalindrome("seven");
        System.out.println(str);
    }
    public String makeSmallestPalindrome(String s) {
        char[] cs = s.toCharArray();
        int n = cs.length;
        for (int i = 0, j = n-1; i < cs.length || j >=0; i++, j--) {
            if (cs[i] != cs[j]) {
                cs[i] = cs[i] <= cs[j] ? cs[i] : cs[j];
            }
        }
        return new String(cs);
    }
}

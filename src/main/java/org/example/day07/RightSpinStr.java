package org.example.day07;

public class RightSpinStr {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        String r = rightSpin(s,k);
        System.out.println(r);
    }

    static String rightSpin(String s, int k) {
        char[] cs = s.toCharArray();
        reverse(cs, 0, cs.length-1);
        reverse(cs,0,k-1);
        reverse(cs,k,cs.length-1);
        return new String(cs);
    }

    static void reverse(char[] cs, int l, int r) {
        while (l < r) {
            char t = cs[l];
            cs[l] = cs[r];
            cs[r] = t;
            l++;
            r--;
        }
    }
}

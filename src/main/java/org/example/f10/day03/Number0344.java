package org.example.f10.day03;

public class Number0344 {
    public static void main(String[] args) {
        char[] s= {'h','e','l','l','o'};
        reverseString(s);
    }

    private static void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l <= r) {
            char t = s[l];
            s[l] = s[r];
            s[r] = t;
            l++;
            r--;
        }
        System.out.println(new String(s));
    }
}

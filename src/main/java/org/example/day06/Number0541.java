package org.example.day06;

public class Number0541 {
    public static void main(String[] args) {
        String s = "bacdefg";
        int k = 2;
        System.out.println(reverseStr(s, k));
    }

    public static String reverseStr(String s, int k) {
        char[] cs = s.toCharArray();
        int n = s.length();
        int index = n - (n % (2 * k));
        System.out.println("Index" + index);
        for (int i = 0; i < index; i+=2*k) {
            int l = i;
            int r = i +k-1;
            while (l <r) {
                char temp = cs[l];
                cs[l] = cs[r];
                cs[r] = temp;
                l++;
                r--;
            }
        }
        if (n-index >= k) {
            int l = index;
            int r = n - 2;
            while (l < r) {
                char temp = cs[l];
                cs[l] = cs[r];
                cs[r] = temp;
                l++;
                r--;
            }
        }
        System.out.println(index);
        return new String(cs);
    }

    public static void reverseString(char[] s) {
        int len = s.length;
        int r = len - 1;
        int l = 0;
        while (l < r) {
            char c = s[l];
            s[l] = s[r];
            s[r] = c;
            l++;
            r--;
        }

    }
}

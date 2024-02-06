package org.example.f10.day03;

public class number0125 {
    public static void main(String[] args) {
        String s = "ab_a";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        char[] cs = s.toCharArray();
        int slow = 0;
        int fast = 0;
        while (fast < cs.length) {
            char c = cs[fast];
            boolean satisfy = c >= 'a' && c <= 'z' ||
                    c >= 'A' && c <= 'Z' || c >= '0' && c <= '9';
            if (satisfy) {
                cs[slow] = cs[fast];
                slow++;
            }
            fast++;
        }
        s = new String(cs, 0, slow).toUpperCase();

        int l = 0;
        int r = s.length() - 1;
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}

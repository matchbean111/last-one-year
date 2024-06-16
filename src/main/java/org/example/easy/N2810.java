package org.example.easy;

import java.util.ArrayDeque;

public class N2810 {
    public static void main(String[] args) {
        String s = "string";

        N2810 t = new N2810();
        System.out.println(t.finalString(s));
    }

    public String finalString(String s) {
        //        StringBuilder sb = new StringBuilder();
        //        for (int i = 0; i < s.length(); i++) {
        //            char c = s.charAt(i);
        //            if (c == 'i') {
        //                sb.reverse();
        //            } else {
        //                sb.append(c);
        //            }
        //        }

        ArrayDeque<Character> q = new ArrayDeque<>();

        boolean tail = true;
        for (char c : s.toCharArray()) {
            if (c == 'i') {
                tail = !tail;
            } else if (tail) {
                q.addLast(c);
            } else {
                q.addFirst(c);
            }
        }

        StringBuilder ans = new StringBuilder();
        for (char c : q) {
            ans.append(c);
        }
        if (!tail) {
            ans.reverse();
        }
        return ans.toString();

    }
}

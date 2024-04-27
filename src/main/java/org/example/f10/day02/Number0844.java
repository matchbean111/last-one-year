package org.example.f10.day02;

import java.util.ArrayDeque;

public class Number0844 {
    public static void main(String[] args) {
        String s = "a##c";
        String t = "#a#c";

        System.out.println(backspaceCompare(s, t));
    }

    private static boolean backspaceCompare(String s, String t) {
        String rs = build(s);
        String rt = build(t);

        return rs.equals(rt);
    }

    private static String build(String t) {
        char[] cs = t.toCharArray();
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == '#') {
                deque.poll();
            } else {
                deque.push(cs[i]);
            }
        }
        StringBuffer sb = new StringBuffer();
        for (Character c : deque) {
            sb.append(c);
        }
        return sb.toString();
    }
}

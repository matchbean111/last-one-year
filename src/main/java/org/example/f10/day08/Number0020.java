package org.example.f10.day08;

import java.util.LinkedList;

public class Number0020 {
    public static void main(String[] args) {
        String s = "{()[]]{}";
        System.out.println(isValid(s));
    }

    private static boolean isValid(String s) {
        int n = s.length();
//        if (n % 2 == 1) return false;

        LinkedList<Character> stack = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(ch);
            } else {
                char p = stack.getFirst();
                if (p == '(' && ch - p == 1) {
                    stack.pop();
                } else if (p == '[' && ch - p == 2) {
                    stack.pop();
                } else if (p == '{' && ch - p == 2) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }
        for (Character c : stack) {
            System.out.print(c);
        }
        return stack.isEmpty();
    }
}
